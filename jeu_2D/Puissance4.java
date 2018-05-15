
package tp5.Partie1;

import java.io.IOException;
import java.util.Scanner;


public class Puissance4 {
    protected static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) throws IOException{
        System.out.println("***Entrez votre nom:");
        String nom = scanner.nextLine();
        System.out.println("--");
        Partie p;
        for (int i = 0; i<3; i++){
            p = new Partie(new Ordinateur(Jeu.BLEU),new Humain(nom, Jeu.ROUGE));
            p.joue();
        }
    }
    
}
