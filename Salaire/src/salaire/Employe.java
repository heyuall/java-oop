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
public abstract class Employe {

    private String nom;
    private String prenom;
    private int age;
    private String date_entre;

    public Employe(String nom, String prenom, int age, String date_entre) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date_entre = date_entre;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDate_entre(String date_entre) {
        this.date_entre = date_entre;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDate_entre() {
        return date_entre;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }
    abstract double calculerSalaire();
    public String affiche() {
        return ("l'employée: " + nom + " " + prenom);
    }

}
