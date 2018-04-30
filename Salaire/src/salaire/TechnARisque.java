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
public class TechnARisque extends Technicien implements Risque {

    public TechnARisque(String nom, String prenom, int age, String date_entre, int nbr_unite) {
        super(nom, prenom, age, date_entre, nbr_unite);
        this.nbr_unite = nbr_unite;
    }

    @Override
    public double calculerSalaire() {
        return (super.calculerSalaire() + primeFix);
    }
}
