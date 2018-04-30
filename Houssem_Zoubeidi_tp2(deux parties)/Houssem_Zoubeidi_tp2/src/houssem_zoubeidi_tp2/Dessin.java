/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp2;

/**
 *
 * @author Lenovo-G510
 */
public class Dessin {
   
   Rectangle []tab;
   Rectangle hullRect;
   
    public Dessin(int taille_max){
      this.tab=new Rectangle[taille_max];
      
    }
   void add (Rectangle r){
      int i=0;
      boolean trouve = false;
      while((i<=tab.length)&&(trouve==false)){
          if (this.tab[i]==null){
             this.tab[i]=r;
             trouve = true;
             this.hullRect= this.hull();
          }
          else{
             i++;
          }
          
      }
      if (trouve == false ){
           System.out.println("on ne peut pas dépasser "+this.tab.length+"Rectangles");
      }   
    }
    
    void translate (double x ,double y){
        for (int i = 0; i < this.tab.length; i++) {
            this.tab[i].translate(x,y);   
        }
        this.hullRect= this.hull();
    }
    
    double surface (){
      double sum = 0;
      for (int i = 0; i < this.tab.length; i++) {
          sum+=tab[i].surface();
        } 
      return sum;
      
    }
    Rectangle hull (){
         return Rectangle.hull(this.tab);
      
    }
}
