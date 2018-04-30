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
public class Forme {
    Point e = new Point(0, 0);
     Color c ;
     public Forme(Point p, int r,int g, int b){
		e = p;
		c = new Color(r,g,b);
	}

	public Forme(Point p, Color c){
		this.e = p;
		this.c = c;
	}
	public void homothetie(double coef){}
}
