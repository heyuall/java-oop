/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_houssem_zoubeidi;

import java.util.ArrayList;

/**
 *
 * @author Lenovo-G510
 */
public class Etudiant {

    String nom;
    int age;
    Ordinateur ord;
    //methode statique pour définir le tableau amis:
    Etudiant [] amis= new Etudiant [5];
    //methode dynamique pour définir le tableau amis:
    ArrayList<Etudiant> amis2= new ArrayList <Etudiant> ();

    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    void changeNom(String nom) {
        this.nom = nom;
    }

    void changeAge(int age) {
        this.age = age;
    }

    void affiche() {
        System.out.println("Le nom est: " + this.nom);
        System.out.println("L'age est :" + this.age);
    }
    void acheterOrdinateur ( Ordinateur ord){
        this.ord = ord;
    }
    
}
