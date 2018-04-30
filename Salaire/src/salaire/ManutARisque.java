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
public class ManutARisque extends Manutentionnaire implements Risque {

    public ManutARisque(String nom, String prenom, int age, String date_entre, double nbr_heures) {
        super(nom, prenom, age, date_entre, nbr_heures);
        this.nbr_heures = nbr_heures;
    }

    public double calculerSalaire() {
        return (super.calculerSalaire() + primeFix);
    }
}
