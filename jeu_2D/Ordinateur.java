
package tp5.Partie1;

import java.io.IOException;


public class Ordinateur extends Joueur {

    
    public Ordinateur(int couleur){
        super(couleur);    
    }

    
    
    @Override
    public void jouer(Jeu jeu) throws IOException {
        int colonne = colonneSuivante(jeu);
        if (colonne >= 0){
            jeu.joueCoup(colonne, couleur);
            System.out.println("Le programme a joué en "+(colonne+1));
        }
        
    }
    
    private int colonneSuivante(Jeu jeu){
        for (int col = 0; col<jeu.getTable().length; col++){
            for (int row = 0; row<jeu.getTable().length; row++){
                if (jeu.getTable()[row][col] == 0){
                    return col;
                }
            }
        }
        return -1;
    }
    
}
