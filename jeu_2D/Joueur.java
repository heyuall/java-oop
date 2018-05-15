
package tp5.Partie1;

import java.io.IOException;

public abstract class Joueur {
    protected int couleur;
    
    public Joueur(int couleur){
        this.couleur = couleur;
    }
    
    public abstract void jouer(Jeu jeu) throws IOException;
    
}
