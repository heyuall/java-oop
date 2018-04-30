/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp2_partie2;
import formesGéometriques.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.ArrayList;


/**
 *
 * @author Lenovo-G510
 */
public class Houssem_Zoubeidi_tp2_partie2 {

    
    /* la hiérarchie des classes est:
                        Forme
		          |
                       ___|____
                       |       |
                       |       |
	        Rectangle   Cercle
		    |
		    |
		  Carre
    */
    public static void main(String[] args) {
        Point p1=new Point(0, 0);
        Point p =new Point(2,2);
        Color C =new Color(1,1,1);
        
        //création d'un carré et son affichage:
        Carré d = new Carré(p, 10, C) ;
        System.out.println(d.toString()); 
        
        //** **//
        System.out.println(C.toString());
        System.out.println();
        //** **//
        
        //création et affichage d'un Rectangle:
        Rectangle R= new Rectangle(p, 10, 12, C);
        System.out.println(R.toString()); 
        
        //création et affichage d'un cercle:
        Cercle o =new Cercle(p, 2, C);
        System.out.println(o.toString());
        
        // affectation du rectangle à un nouveau objet forme:
        Forme f = R;
        
        
       f.homothetie(3);
       System.out.println(f.toString()); 
       R.homothetie(2);
       System.out.println(R.toString());
      
       
       
       //création d'un objet vectorFormes:
        VectorFormes L =new VectorFormes();
        //l'ajout d'un rectangle (méthode simple):
        L.add(R);
        System.out.println(L.toString());
        
        //l'ajout d'un carré et d'un cercle (méthode simple):(il va afficher le message d'erreur)
        L.add1(o);
        L.add1(d);
        System.out.println(L.toString());
        
        //Ajoutons un rectangle R1:
        Color c1= new Color(010);
        Rectangle R1 =new Rectangle(c1);
        L.add1(R1);
        System.out.println(L.toString());
    }
    
}
