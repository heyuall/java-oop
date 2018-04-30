/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_houssem_zoubeidi;

/**
 *
 * @author Lenovo-G510
 */
public class Ordinateur {
    String marque;
    String processeur;
    String memoire;
    int etat;

    public Ordinateur() {
    }

    public Ordinateur(String marque, String processeur, String memoire, int etat) {
        this.marque = marque;
        this.processeur = processeur;
        this.memoire = memoire;
        this.etat = etat;
    }
    void changerEtat(int etat){
        this.etat=etat;
    }
    
}
