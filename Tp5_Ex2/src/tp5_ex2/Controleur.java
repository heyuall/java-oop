/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_ex2;

import java.util.Scanner;

/**
 *
 * @author Lenovo-G510
 */
public class Controleur extends Robot {

    public Controleur() {

    }

    public void Dialogue() {
        System.out.println("Si vous voulez tourner à droite appuiez sur la touche \"T\":\nSi vous voulez Avancer le robot appuiez sur la touche \"A\": ");
        System.out.println("Si vous voulez afficher la position actuelle appuiez sur la touche \"P\": ");
        System.out.println("Si vous voulez quitter appuiez sur la touche \"Q\":\n");
        System.out.println("*" + this.orientation);
        Scanner lire = new Scanner(System.in);
        String S;
        S = lire.next();
        while (true) {

            //Scanner lire = new Scanner(System.in);
            //String S;
            if (S.equals("A")) {
                this.Avancer();
                System.out.println("*" + this.orientation);
            } else if (S.equals("T")) {
                this.TourneraDroite();
                System.out.println("*" + this.orientation);
            } else if (S.equals("P")) {
                this.AffichePosition();
            } else if (S.equals("Q")) {
                break;
            } else {
                System.out.println("Entrée invalide ! :) ");
            }

            S = lire.next();

        }
    }
}
