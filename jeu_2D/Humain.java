
package tp5.Partie1;

import java.io.*;


public class Humain extends Joueur {

    private String nom;
    
    BufferedReader gi = new BufferedReader(new InputStreamReader(System.in));
    
    
    public Humain(String nom,int couleur) throws IOException{
        super(couleur);
        this.nom = nom;
    }
    
    
    @Override
    public void jouer(Jeu jeu) throws IOException {
        int colonne = gi(jeu.getTable().length);
        jeu.joueCoup(colonne-1, couleur);
    }
    
    private int  gi(int length) throws IOException{
        System.out.println("****Joueur "+nom+", entrer un numéro de colonne (entre 1 et "+length+") :");
        return Integer.parseInt(gi.readLine().trim());
    }
    
}
