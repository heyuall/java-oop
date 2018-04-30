/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Bibliotheque {

    static ArrayList<Document> doc = new ArrayList<>();
    static ArrayList<Document> empruntes = new ArrayList<>();
    static ArrayList<Adherent> adherents = new ArrayList<>();

    static Etagere haute = new Etagere();
    static Etagere milieu = new Etagere();
    static Etagere basse = new Etagere();
    static final int TAILLEMAX = 999; // capacité ou taille maximal de l'étagère

    /* 
       Methode chercherDocument avant la création de l'étagère:
       
       
    public static Document[] chercherDocument(String titre) {
     Document[] Tab = new Document [Document.nbr_total];
     int k=0;
         for (Document D : doc){
             if (D.title.indexOf(titre)!= -1){
                Tab [k]= D;
                k++;
             }
         
         }
         return Tab;
       
      }
     */
    public static void interaction() {
        System.out.print("Quelle opération voulez vous faire?\t \n 1) Ajouter un adhérent \n 2) Ajouter un Document\n"
                + "3) Faire un emprunt // donner CIN de l'adhérant et l'id du document\n"
                + "4) Rendre un emprunt // donner CIN et l'id du document\n"
                + "5) Afficher le nbre totale des documents dans la bibliothèque\n"
                + "6) Afficher le nbre totale des livres, de mémoires et de Volumes\n"
                + "7) Quels sont les documents empruntés par un adhérant// Donner \n "
                + "8)Afficher la liste ds documents empruntés\n"
                + "9) Quitter l'application\n");

        Scanner lire = new Scanner(System.in);
        int a;
        do {
            a = lire.nextInt();
            switch (a) {
                case 1:
                    operation1();
                    break;
                case 2:
                    operation2();
                    break;
                case 3:
                    operation3();
                    break;
                case 4:
                    operation4();
                    break;
                case 5:
                    operation5();
                    break;
                case 6:
                    operation6();
                    break;
                case 7:
                    operation7();
                    break;
                case 8:
                    operation8();
                    break;

            }
        } while (a != 9);

    }

    public static void operation1() {
        //l'ajout d'un adhérent:
        Scanner lire = new Scanner(System.in);
        String cin, nom;
        System.out.println("Donner le nom de l'adhérent:\t");
        nom = lire.next();
        System.out.println("Donner le CIN de l'adhérent:\t");
        cin = lire.next();
        adherents.add(new Adherent(nom, cin));
    }

    public static void operation2() {
        //l'ajout d'un document:
        Scanner lire = new Scanner(System.in);
        String t;
        System.out.println("Donner le nom du document:\t");
        t = lire.next();
        doc.add(new Document(t));
    }

    public static void operation3() {
        Scanner lire = new Scanner(System.in);
        String cin;
        int id;
        System.out.println("Donner le CIN de l'adhérent:");
        cin = lire.next();
        System.out.println("Donner l'id du Document:");
        id = lire.nextInt();

        Document v = null;

        v = recupererDocument(id);

        if (v != null) {

            if (estMembre(cin)) {

                Date d = new Date();
                emprunter(v, recupererAdherent(cin), d);

            } else {
                System.out.println("CIN invalide");
            }
        } else {
            System.out.println("Aucun livre avec cet id");
        }
    }

    public static void operation4() {
        Scanner lire = new Scanner(System.in);
        String cin;
        int id;
        System.out.println("Donner le CIN de l'adhérent:");
        cin = lire.next();
        System.out.println("Donner l'id du Document:");
        id = lire.nextInt();

        if (estMembre(cin)) {
            Adherent a = recupererAdherent(cin);
            Document v = null;
            for (Document d : a.emprunte) {
                if (d.id==id) {
                    v = d;
                }
            }
            if (v != null) {
                retourner(v, a);
            } else {
                System.out.println("Aucun livre emprunté par " + a.nom + " avec cei identifiant :( ");
            }
        } else {
            System.out.println("CIN invalide");
        }
    }

    public static void operation5() {
        System.out.println("Le nombre total de documents dans la bibliotheque est = " + Document.nbr_total);

    }

    public static void operation6() {
        System.out.println("Nombre total des volumes = " + Volume.nbrVol);
        System.out.println("Nombre total des livres = " + Livre.nbrLiv);
        System.out.println("Nombre total des memoires = " + Memoire.nbrMem);
    }

    public static void operation7() {
        String cin;
        Scanner lire = new Scanner(System.in);
        System.out.println("Donner le CIN de l'adhérent:");
        cin = lire.next();
        if (estMembre(cin)) {
            recupererAdherent(cin).afficherEmpruntes();
        } else {
            System.out.println("CIN invalide");
        }
    }

    public static void operation8() {
        afficherEmpruntes();
    }

    public static void ajouterDocument(Document d, Etagere e) {
        e.ajouterDocument(d);
    }

    public static int nombreDocuments(Etagere e) {
        return e.nombreDocuments();
    }

    public static Document recupererDocument(int position, int etagere) {
        if (etagere == 1) {
            return basse.recupererDocument(position);
        } else if (etagere == 2) {
            return milieu.recupererDocument(position);
        } else {
            return haute.recupererDocument(position);
        }
    }

    public static Document recupererDocument(String titre) {
        for (Document d : basse.contenu) {
            if (d.title.equals(titre)) {
                return d;
            }
        }
        for (Document d : milieu.contenu) {
            if (d.title.equals(titre)) {
                return d;
            }
        }
        for (Document d : haute.contenu) {
            if (d.title.equals(titre)) {
                return d;
            }
        }
        return null;
    }
    public static Document recupererDocument(int id) {
        for (Document d : basse.contenu) {
            if (d.id==id) {
                return d;
            }
        }
        for (Document d : milieu.contenu) {
            if (d.id == id) {
                return d;
            }
        }
        for (Document d : haute.contenu) {
            if (d.id==id) {
                return d;
            }
        }
        return null;
    }

    public static void retirerDocument(Document d, Etagere e) {
        e.retirerDocument(d.title);
    }

    public static void ajouterAdherent(Adherent a) {
        adherents.add(a);
    }

    public static Adherent recupererAdherent(String CIN) {
        for (Adherent a : adherents) {
            if (CIN.equals(a.cin)) {
                return a;
            }
        }
        return null;
    }

    public static void ajouterDocument(Document d) {
        //docs.add(d);
        if (basse.nombreDocuments() < TAILLEMAX) {
            ajouterDocument(d, basse);
        } else if (milieu.nombreDocuments() < TAILLEMAX) {
            ajouterDocument(d, milieu);
        } else if (haute.nombreDocuments() < TAILLEMAX) {
            ajouterDocument(d, haute);
        } else {
            System.out.println(" ERROR: Etagères  pleines !! :( ");
        }

    }

    public static void afficherDocuments() {
        System.out.println("Etagere basse :");
        basse.afficherEtagere();
        System.out.println("Etagere milieu :");
        milieu.afficherEtagere();
        System.out.println("Etagere haute :");
        haute.afficherEtagere();
    }

    public static void afficherEmpruntes() {
        if (!empruntes.isEmpty()) {
            for (Document v : empruntes) {
                System.out.println("/*/ " + v.title);
            }
        } else {
            System.out.println("Aucun livre est empruntés");
        }
    }

    public static boolean estMembre(String CIN) {
        for (Adherent ad : adherents) {
            if (CIN.equals(ad.cin)) {
                return true;
            }
        }
        return false;
    }

    public static boolean contient(Document d) {
        return basse.contenu.contains(d) || milieu.contenu.contains(d) || haute.contenu.contains(d);
    }

    public static void emprunter(Document v, Adherent a, Date d) {
        if (contient(v)) {
            if (a.emprunter(v, d)) {
                empruntes.add(v);
                if (basse.contenu.contains(v)) {
                    retirerDocument(v, basse);
                } else if (milieu.contenu.contains(v)) {
                    retirerDocument(v, milieu);
                } else {
                    retirerDocument(v, haute);
                }
            }
        } else {
            System.out.println("Ce document n'est pas prÃ©sent dans la bibliothÃ¨que");
        }

    }

    public static void retourner(Document v, Adherent a) {
        a.retourner(v);
        ajouterDocument(v); // on le rajoute
        empruntes.remove(v);
    }

    public static void afficherResultatRecherche(Document L[]) {
        if (L != null) {
            for (Document v : L) {
                System.out.println(v.title);
            }
        } else {
            System.out.println("introuvable");
        }
    }

    //les modificatiobns sur la méthode chercherDocument :
    public static Document[] chercherDocument(String titre) {
        ArrayList<Document> res = new ArrayList<>();
        for (Document d : basse.contenu) {
            if (d.title.contains(titre)) {
                res.add(d);
            }
        }
        for (Document d : milieu.contenu) {
            if (d.title.contains(titre)) {
                res.add(d);
            }
        }
        for (Document d : haute.contenu) {
            if (d.title.contains(titre)) {
                res.add(d);
            }
        }
        if (!res.isEmpty()) {
            Document[] L = new Document[res.size()];
            int k = -1;
            for (Document d : res) {
                L[k++] = d;
            }
            return L;
        } else {
            return null;
        }
    }
}
