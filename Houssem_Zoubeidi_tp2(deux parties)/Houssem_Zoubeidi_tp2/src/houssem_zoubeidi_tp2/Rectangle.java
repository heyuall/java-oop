package houssem_zoubeidi_tp2;


import houssem_zoubeidi_tp2.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo-G510
 */
public class Rectangle {
    static int nbrRec;//attribut statique relatif a la classe
    Point p_bas_gch;
    double longueur, largeur;

    //constructeurs:
    public Rectangle(Point p_bas_gch,Point q) {
        this.p_bas_gch= p_bas_gch;
        this.largeur=q.y - p_bas_gch.y;
        this.longueur= q.x-p_bas_gch.x;
        Rectangle.nbrRec+=1;//
    }
    public Rectangle(Point p_bas_gch,double largeur,double longueur){
        this.largeur=largeur;
        this.longueur=longueur;
        this.p_bas_gch=p_bas_gch;
        Rectangle.nbrRec+=1;
    }
    public Rectangle(double x1,double x2,double y1,double y2){
        this.largeur=y2 - y1;
        this.longueur= x2 - x1;
        this.p_bas_gch.x= x1;
        this.p_bas_gch.y= y1;
        Rectangle.nbrRec+=1;
    }
    
    //méthodes:
     double surface(){
        return(largeur * longueur);
    }
     void translate (double x, double y){
         this.p_bas_gch.x += x;
         this.p_bas_gch.y += y;
     }
     boolean contains(Point p){
       double x = p.x;
       double y = p.y;
       if (((x>=this.p_bas_gch.x)&&(x<=this.p_bas_gch.x + this.longueur))||((this.p_bas_gch.y<=y)&&(this.p_bas_gch.y+this.largeur>=y))){
           return true;
       }
       else
           return false;
     }
     boolean contains (Rectangle r){
         if (this.contains(r.p_bas_gch)){
             if(r.longueur<=this.longueur){
                 if(r.largeur<=this.largeur){return true;}
                 else{return false;}
             }
             else{return false;}
         }
         else{return false;}
     }
     
     boolean smaeAs(Rectangle r){
         if ((r.p_bas_gch==this.p_bas_gch)&&(r.largeur==this.largeur)&&(r.longueur==this.longueur)) {
           return true ; 
         }
         else
            return false;
  
     }
    
     static Rectangle hull(Rectangle[]T){
        double maxx=0;
        double minx=0;
        double maxy=0 ;
        double miny=0;
         for (int i = 0; i < T.length; i++) {
             if(T[i].p_bas_gch.x < minx) {
                 minx =T[i].p_bas_gch.x;
             }
             if(T[i].p_bas_gch.x> maxx) {
                 maxx = T[i].p_bas_gch.x;
             }
            if (T[i].p_bas_gch.y< miny){
               miny =T[i].p_bas_gch.y; 
            }
             if (maxy < T[i].p_bas_gch.y) {
                 maxy=T[i].p_bas_gch.y;
             }
             
         }
         Rectangle R;
         R=new Rectangle(minx, maxx, miny, maxy);
         return R;
        }
}
