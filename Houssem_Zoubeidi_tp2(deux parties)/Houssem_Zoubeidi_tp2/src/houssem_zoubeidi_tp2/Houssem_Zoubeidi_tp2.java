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
public class Houssem_Zoubeidi_tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Point p =new Point(2.0, 8.0);
        Rectangle R;
        R = new Rectangle(p,10,5);
        System.out.println(R.p_bas_gch.x);
        System.out.println(R.p_bas_gch.y);
        R.translate(2,1);
        System.out.println("le nouveau abscisse est: " + R.p_bas_gch.x);
        System.out.println(" la nouvelle oordonnée est: "+R.p_bas_gch.y);
        
    }
    
}
