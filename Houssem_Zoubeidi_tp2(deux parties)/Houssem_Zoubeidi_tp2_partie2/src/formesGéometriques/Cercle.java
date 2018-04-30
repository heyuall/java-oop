/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formesGéometriques;

/**
 *
 * @author Lenovo-G510
 */
import java.awt.Color;

public class Cercle extends Forme{
	double rayon;

	public Cercle(Color c){
		super(new Point(0,0),c);
		rayon = 1;
	}
	
	public Cercle(Point p, double r, Color c){
		super(p,c);
		rayon = r;
	}

	public void homothetie(double coef){
		rayon *= coef;
	}

	public String toString(){
		return "[Cercle\n\t[centre de gravité : " + e.x + "\t,\t"+ e.y +"]\n\t[Rayon : " + rayon +"]\n\t[couleur : " + c.toString().substring(15,26) + "]\n]\n" ;
	}
}
