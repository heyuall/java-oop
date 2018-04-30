/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

import java.util.Date;

public class Livre extends Volume {

    Date emprunt;
    Date retour = new Date(0, 0, 1);
    static int nbrLiv = 0;
    boolean etat = false;

    public Livre(String t, String a) {
        super(t, a);
        nbrLiv++;
    }

    public boolean emprunter(Date d) {
        emprunt = d;
        retour.setDate(d.getDate() + 3); // le retour est  apres 3 de la date de l'emprunt
        retour.setMonth(d.getMonth());
        retour.setYear(d.getYear());
        etat = true;
        return true;
    }
}