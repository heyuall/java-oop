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
public class Carré extends Rectangle {
    
    public Carré(Color c){
		super(c);
	}

	public Carré(Point p, double arête, Color c){
		super(p,arête,arête,c);
	}


	public String toString(){
		return "[Carré\n\t[centre de gravité : \t x="+ e.x +"\t,\ty="+e.y+"]\n\t[arête \t:\t"+ largeur  +"]\n\t[couleur : " + c.toString().substring(15,26) + "]\n]\n" ;
	}
}
    
