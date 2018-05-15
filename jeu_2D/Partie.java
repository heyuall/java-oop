
package tp5.Partie1;

import java.io.IOException;


public class Partie {
    private Jeu jeu;
    private Joueur humain, ordinateur;
    
    private final int TAILLE = 8;
    
    public Partie(Ordinateur ordinateur, Humain humain){
        this.ordinateur = ordinateur;
        this.humain = humain;
        jeu = new Jeu(TAILLE);
    }
    
    public void joue() throws IOException{
        while (!jeu.cherche4() && !jeu.estPlein()){
            ordinateur.jouer(jeu);
            jeu.print();
            if (jeu.cherche4()){ break; }
            humain.jouer(jeu);
        }
    }
    
    
}
