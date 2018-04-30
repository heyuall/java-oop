/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaire;

import java.util.ArrayList;

/**
 *
 * @author Lenovo-G510
 */
public class Personnel {

    ArrayList<Employe> collection = new ArrayList<>();

    public void ajouterEmploye(Employe e) {
        collection.add(e);
    }

    public void afficheSalaire() {
        for (int i = 0; i < collection.size(); i++) {

            System.out.println("le " + collection.get(i).getClass().getName().substring(8) + " " + collection.get(i).getNom() + " "
                    + collection.get(i).getPrenom() + " gagne " + (int) (collection.get(i).calculerSalaire()) + " dinars");
        }
    }

    public double afficheSalaireMoy() {
        double s = 0;
        for (int i = 0; i < collection.size(); i++) {
            s += collection.get(i).calculerSalaire();
        }

        return (int) (s / collection.size());
    }

}
