/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formesGéometriques;
import java.awt.Color;

/**
 *
 * @author Lenovo-G510
 */
public class Rectangle extends Forme{
   double hauteur;
   double largeur;
	public Rectangle(Color c){
		super(new Point(0,0), c);
		this.hauteur = 2;
                this.largeur = 5;
	}

	public Rectangle(Point g,  double h, double l, Color c){
		super(g,c);
		this.hauteur = h;
		this.largeur = l;
	}
	
	public void homothetie( double coef){
		hauteur *= coef;
		largeur *= coef;
	}

	public String toString(){
		return "[Rectangle\n\t[centre de gravité : \t x="+ e.x +"\t,\ty="+e.y+"]\n\t[largeur : " + largeur + ", hauteur : " + hauteur +"]\n\t[couleur : " +this.c.toString().substring(15,26) + "]\n]\n" ;
	}
    
}
