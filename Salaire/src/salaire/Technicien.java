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
public class Technicien extends Employe {

    int nbr_unite;

    public Technicien(String nom, String prenom, int age, String date_entre, int nbr_unite) {
        super(nom, prenom, age, date_entre);
        this.nbr_unite = nbr_unite;
    }

    @Override
    public double calculerSalaire() {
        return (nbr_unite * 5);

    }

    public int getNbr_unite() {
        return nbr_unite;
    }

    public void setNbr_unite(int nbr_unite) {
        this.nbr_unite = nbr_unite;
    }

    @Override
    public String affiche() {
        return ("Technicien: " + getNom() +" "+ getPrenom());
    }
}
