/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

import java.util.Date;

public class Memoire extends Volume {

    Enseignant jury[] = new Enseignant[3];
    Date date_soutenance;
    Date emprunt;
    Date retour = new Date(); //date actuelle
    boolean etat = false;
    static int nbrMem = 0;

    public Memoire(String t, String a) {
        super(t, a);
        nbrMem++;
    }

    public Memoire(String t, String a, Date d, Enseignant J[]) {
        super(t, a);
        date_soutenance = d;
        jury = J;
        nbrMem++;
    }
    
    public void ajouterJury(Enseignant e){
        int k = 0;
        for (Enseignant ens : jury){
            if (ens == null){ 
                jury[k] = e; 
                break; 
            }
            k++;
        }
    }
    
    public void modifierDate_soutenance(Date d){
        date_soutenance = d;
    }

    public boolean emprunter(Date d) {
        emprunt = d;
        retour.setDate(d.getDate() + 3); // le retour est  apres 3 de la date de l'emprunt
        retour.setMonth(d.getMonth());
        retour.setYear(d.getYear());
        return true;
    }

    public void prolonger(int prolongement) {
        retour.setDate(retour.getDate() + prolongement);
    }

}
