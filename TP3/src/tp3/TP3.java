package tp3;
import java.io.IOException;
import java.util.Date;

public class TP3 {

   /*
    voici l'hierarchie des classes:
   *         Document        Bibliotheque        Adherant           Etagere
   *        /        \                            /    \
   *       /          \                          /      \
   *    Jounal       Volume                 Etudiant   Enseignant
   *               /    |    \
   *              /     |     \
   *     Dictionnaire  Livre  Memoire
    */
    
    public static void main(String[] args) throws IOException {
        
        Bibliotheque.interaction();
        
        
    }
    
    
}
