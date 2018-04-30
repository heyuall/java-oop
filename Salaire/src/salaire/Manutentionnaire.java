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
public class Manutentionnaire extends Employe {

    double nbr_heures;

    public Manutentionnaire(String nom, String prenom, int age, String date_entre, double nbr_heures) {
        super(nom, prenom, age, date_entre);
        this.nbr_heures = nbr_heures;
    }

    @Override
    double calculerSalaire() {
        return (nbr_heures * 65);
    }

    public double getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(double nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    @Override
    public String affiche() {
        return( "Manutentionnneur: " + getNom() +" "+ getPrenom());
    }

}
