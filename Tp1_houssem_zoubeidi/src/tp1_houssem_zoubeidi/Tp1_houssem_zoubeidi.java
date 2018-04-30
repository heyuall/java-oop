/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_houssem_zoubeidi;

import java.util.Scanner;

public class Tp1_houssem_zoubeidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Exercice N°1:
            /*
        System.out.println("Bonjour , mon premier TP en POO");

        //lecture du nom:
        System.out.println("Quelle est votre nom?");
        Scanner lire = new Scanner(System.in);
        String nom = lire.nextLine();

        //lecture de l'age:
        System.out.println();
        System.out.println("Bonjour" + nom);
        System.out.println("Quel est votre age " + nom + "?");
        lire = new Scanner(System.in);
        int a;
        a = lire.nextInt();
        System.out.println(nom + " Votre age est " + a);
       
       // La ligne supplémentaire est: "lire = new Scanner(System.in);"
            */

        //Exercice N°2:
        //a)
        //ajoutons un objet Etudiant
            /* 
        Etudiant student = new Etudiant("houssem", 21);
        student.affiche();
        student.changeAge(22);
        student.changeNom("zoubeidi");
        student.affiche();
            */
            
        //b)
            /* 
        Scanner lire = new Scanner(System.in);
        String[] c = new String[2];
        int[] b = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("donner le nom:"); 
            c[i] = lire.next();
            System.out.println("donner l'age");
            b[i] = lire.nextInt();
        }
        Etudiant etudiant1=new Etudiant(c[0], b[0]);
        Etudiant etudiant2= new Etudiant(c[1], b[1]);
        etudiant2.affiche();
        etudiant2.changeAge(30);
        System.out.println("le nouveau etudiant a les paramètres suivants:");
        etudiant2.affiche();
            */
            
        //on peut faire la saisie des nom et des ages dans les constructeurs
        
        //c) *** voir la classe Ordinateur ***
        
        //d)
            /*
        Ordinateur ibm = new Ordinateur();
        Ordinateur asus = new Ordinateur();
            */
            
        //e)  *** voir la classe Etudiant ***  
        
        // f)
            /* 
        Etudiant student = new Etudiant("houssem", 21);
        student.acheterOrdinateur(new Ordinateur());
            */
        
        //g) *** voir la classe Etudiant *** 
        
        //h)
            /*
        Scanner lire = new Scanner(System.in);
        String nom;
        int age;
        Etudiant houssem = new Etudiant("Houssem", 21);
        //methode 1:
        for (int i = 0; i < houssem.amis2.size(); i++) {
            nom = lire.next();
            age = lire.nextInt();
            houssem.amis2.add(new Etudiant(nom, age));
        }
        //methode 2:
        for (int i = 0; i < 5; i++) {
            nom = lire.next();
            age = lire.nextInt();
            houssem.amis[i] = new Etudiant(nom, age);
        }
            */

    }

}
