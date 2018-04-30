/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaire;

/**
 *
 * @author Lenovo-G510
 */
public class Representant extends Employe {

    private double chiffre_affaire;

    public Representant(String nom, String prenom, int age, String date_entre, double chiffre_affaire) {
        super(nom, prenom, age, date_entre);
        this.chiffre_affaire = chiffre_affaire;
    }

    @Override
    double calculerSalaire() {
        return chiffre_affaire * 0.2 + 800;

    }

    public void setChiffre_affaire(double chiffre_affaire) {
        this.chiffre_affaire = chiffre_affaire;
    }

    public double getChiffre_affaire() {
        return chiffre_affaire;
    }

    @Override
    public String affiche() {
        return ("Representant: " + getNom() +" "+ getPrenom());
    }
}
