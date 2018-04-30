/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

import java.util.ArrayList;
import java.util.Date;

public class Adherent {

    ArrayList<Document> emprunte = new ArrayList<>();
    String nom;
    String cin; //Cin

    public Adherent(String nom, String CIN) {
        this.nom = nom;
        cin = CIN ;
    }

    public boolean emprunter(Document D, Date d) {  //****
        if (emprunte.size() <= 3) {
        //methode 1:
            //if ((D.getClass().getName() == "Livre") ||(D.getClass().getName()== "Memoire")) {
             //   emprunte.add(D);
              //  return true;
                
            //}
            //else{return false;}
        //Methode 2:    
            if (D.emprunter()) {
                emprunte.add(D);
                return true;
            }
            else{ return false; }
        } else {
            System.out.println("interdit d'emprunter plus que 3 volumes");
            return false;
        }
    }

    public void retourner(Document v) {
        if (!emprunte.isEmpty()) {
            emprunte.remove(v);
        } else {
            System.out.println("pas d'emprunte de ce nom :" + nom);
        }
    }
 public void afficherEmpruntes() {
        if (!emprunte.isEmpty()) {
            for (Document d : emprunte) {
                System.out.println("| " + d.title);
            }
        } else {
            System.out.println("pas d'emprunte de ce nom :" + nom);
        }
    }
    
}