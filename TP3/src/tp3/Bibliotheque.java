package tp3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

public class Bibliotheque {

    static ArrayList<Document> docs = new ArrayList<>();
    static ArrayList<Document> empruntes = new ArrayList<>();
    static ArrayList<Adherant> adherents = new ArrayList<>();
    static Etagere haute = new Etagere();
    static Etagere milieu = new Etagere();
    static Etagere basse = new Etagere();
    static final int TAILLEMAX = 100; // capacité ou taille maximal d'une étagere
    
    public static void ajouterDocument(Document d, Etagere e) {
        e.ajouterDocument(d);
    }

    public static int nombreDocuments(Etagere e) {
        return e.nombreDocuments();
    }
    
    public static Document recupererDocument(int position, int etagere){
        if (etagere == 1){
            return basse.recupererDocument(position);
        }
        else if (etagere == 2){
            return milieu.recupererDocument(position);
        }
        else {
            return haute.recupererDocument(position);
        }
    }
    
    public static Document recupererDocument(String titre){
        for (Document d : basse.contenu) {
                        if (d.titre.equals(titre)) {
                            return d;
                        }
                    }
        for (Document d : milieu.contenu) {
                        if (d.titre.equals(titre)) {
                            return d;
                        }
                    }
        for (Document d : haute.contenu) {
                        if (d.titre.equals(titre)) {
                            return d;
                        }
                    }
        return null;
    }


    public static void retirerDocument(Document d, Etagere e) {
        e.retirerDocument(d.titre);
    }

    public static void ajouterAdherant(Adherant a) {
        adherents.add(a);
    }
    
        public static Adherant recupererAdherant(String CIN) {
        for (Adherant a : adherents) {
            if (CIN.equals(a.cin)) {
                return a;
            }
        }
        return null;
    }

    public static void ajouterDocument(Document d) {
        //docs.add(d);
        if (basse.nombreDocuments() < TAILLEMAX){
            ajouterDocument(d, basse);
        }
        else if (milieu.nombreDocuments() < TAILLEMAX){
            ajouterDocument(d, milieu);
        }
        else if (haute.nombreDocuments() < TAILLEMAX){
            ajouterDocument(d, haute);
        }
        else {
            System.out.println("Tous les etageres sont pleins !");
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
                System.out.println("| " + v.titre);
            }
        } else {
            System.out.println("Aucun livre est empruntés");
        }
    }

    public static boolean estMembre(String CIN) {
        for (Adherant ad : adherents) {
            if (CIN.equals(ad.cin)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean contient(Document d){
        return basse.contenu.contains(d) || milieu.contenu.contains(d) || haute.contenu.contains(d);
    }

    public static void emprunter(Document v, Adherant a, Date d) {
        if (contient(v)) {
            if (a.emprunter(v, d)) {
                empruntes.add(v);
                if (basse.contenu.contains(v)){ retirerDocument(v, basse); }
                else if (milieu.contenu.contains(v)){ retirerDocument(v, milieu); }
                else { retirerDocument(v, haute); }
            }
        } else {
            System.out.println("Ce document n'est pas présent dans la bibliothèque");
        }

    }

    public static void retourner(Document v, Adherant a) {
        a.retourner(v);
        ajouterDocument(v); // on le rajoute
        empruntes.remove(v);
    }

    public static void afficherResultatRecherche(Document L[]) {
        if (L != null) {
            for (Document v : L) {
                System.out.println("| " + v.titre);
            }
        } else {
            System.out.println("Aucun document correspond à la recherche");
        }
    }

    public static Document[] chercherDocument(String cle) {
        ArrayList<Document> res = new ArrayList<>();
        for (Document d : basse.contenu) {
            if (d.titre.contains(cle)) {
                res.add(d);
            }
        }
        for (Document d : milieu.contenu) {
            if (d.titre.contains(cle)) {
                res.add(d);
            }
        }
        for (Document d : haute.contenu) {
            if (d.titre.contains(cle)) {
                res.add(d);
            }
        }
        if (!res.isEmpty()) {
            Document[] L = new Document[res.size()];
            int k = 0;
            for (Document d : res) {
                L[k++] = d;
            }
            return L;
        } else {
            return null;
        }
    }

    public static void interaction() throws IOException {
        String line1 = " __________________________________________________________________\n";
        String line2 = "|   Quelle operation voulez-vous effectuer?;                       |\n";
        String line3 = "|                                                                  |\n";
        String line4 = "|1) Ajouter un Adherant                                            |\n";
        String line5 = "|2) Ajouter un Document                                            |\n";
        String line6 = "|3) Faire un emprunt                                               |\n";
        String line7 = "|4) Rendre un emprunt                                              |\n";
        String line8 = "|5) Afficher le nombre total des documents dans la bibliotheque    |\n";
        String line9 = "|6) Afficher le nombre total des livres, memoires et volumes       |\n";
        String line10 = "|7) Quels sont les documents empruntes par un adherant             |\n";
        String line11 = "|8) Afficher la liste des documents empruntes                      |\n";
        String line12 = "|9) Quitter l'application                                          |\n";
        String line13 = "|__________________________________________________________________|\n";
        String line14 = "  Tapez le numero de votre choix: ";
        String menu = line1 + line2 + line3 + line4 + line5 + line6 + line7 + line8 + line9 + line10 + line11 + line12 + line13 + line14; //concat

        //variables d'interaction avec utilisateur:
        int input = 0;
        int input20 = 0;
        BufferedReader gi = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter go = new PrintWriter(System.out, true);
        String line = "";
        String line20 = "";
        String lines[];
        Document se[];
        while (input != 9) {
            go.println(menu);
            try {
                input = Integer.parseInt(gi.readLine());
            } catch (Exception e) {
                go.println("Entrée invalide, réessayez");
                input = 0;
            }
            if (input == 1) {
                go.println("Donner un nom pour l'adherant:");
                line = gi.readLine().trim(); //amina ch
                go.println("Donner le CIN de " + line);
                line20 = gi.readLine().trim();
                if (estMembre(line20)) {
                    go.println("Ce CIN existe deja");
                } else {
                    go.println("Cet adherant est-il un enseignant (Y/N)?"); //Y = Yes; N = No 
                    Adherant a;
                    if (gi.readLine().trim().equals("Y")) {
                        a = new Enseignant(line, line20);
                    } else {
                        a = new Etudiant(line, line20);
                    }
                    ajouterAdherant(a);
                    go.println("CIN de l'adherant " + a.nom + " est : " + a.cin);
                }
            } else if (input == 2) {
                go.println("Quel type de document voulez-vous ajouter?");
                go.println("1) Journal\n2) Dictionnaire\n3) Livre\n4) Memoire\n");
                input = 0;
                while (input < 1 || input > 5) {
                    input = Integer.parseInt(gi.readLine());
                    if (input < 1 || input > 5) {
                        go.println("Entrée invalide, réessayez");
                    }
                }
                if (input == 1) {
                    go.println("Donner le nom du Journal:");
                    line = gi.readLine().trim();
                    go.println("Donner la date de parution du " + line + " (sous la forme JJ/MM/AAAA)");
                    lines = gi.readLine().split("/");
                    try {
                        Date d = new Date(Integer.parseInt(lines[2]) - 1900, Integer.parseInt(lines[1]) - 1, Integer.parseInt(lines[0]));
                        ajouterDocument(new Journal(line, d));
                    } catch (Exception e) {
                        Date d = new Date();
                        ajouterDocument(new Journal(line, d));
                        go.println("Date invalide, date actuelle va etre prise comme date de parution");
                    }
                } else if (input == 2) {
                    go.println("Donner le nom du Dictionnaire:");
                    line = gi.readLine().trim();
                    go.println("Donner l'auteur");
                    line20 = gi.readLine().trim();
                    Dictionnaire dict = new Dictionnaire(line, line20);
                    ajouterDocument(dict);
                } else if (input == 3) {
                    go.println("Donner le nom du Livre:");
                    line = gi.readLine().trim();
                    go.println("Donner l'auteur");
                    line20 = gi.readLine().trim();
                    Livre Liv = new Livre(line, line20);
                    ajouterDocument(Liv);
                } else {
                    go.println("Donner le nom du memoire:");
                    line = gi.readLine().trim();
                    go.println("Donner l'auteur");
                    line20 = gi.readLine().trim();
                    Memoire mem = new Memoire(line, line20);
                    go.println("Donner les CIN des jurys (separés par des espaces): ");
                    lines = gi.readLine().trim().split(" ");
                    for (String s : lines) {
                        try {
                            mem.ajouterJury((Enseignant) recupererAdherant(s));
                        } catch (Exception e) {
                            go.println("Le CIN " + s + " ne correspond pas à un enseignant ");
                        }
                    }
                    go.println("Donner la date de soutenance (sous la forme JJ/MM/AAAA)");
                    lines = gi.readLine().trim().split("/");
                    try {
                        Date d = new Date(Integer.parseInt(lines[2]) - 1900, Integer.parseInt(lines[1]) - 1, Integer.parseInt(lines[0]));
                        mem.modifierDate(d);
                    } catch (Exception e) {
                        Date d = new Date();
                        d.setDate(d.getDate() + 30);
                        mem.modifierDate(d);
                        go.println("Date invalide, la date de soutenance va etre après 30 jours d'ajourd'hui");
                    }
                    ajouterDocument(mem);
                }
            } else if (input == 3) {
                
                Document v;
                try {
                    go.println("Choisissez une etagere \n1)basse\n2)milieu\n3)haute");
                    input20 = Integer.parseInt(gi.readLine().trim()); // etagere
                    go.println("Donner la position de document à emprunter dans cette etagere : ");
                    input = Integer.parseInt(gi.readLine().trim()); //position
                    v = recupererDocument(input, input20);
                } catch (Exception e) {
                    go.println("Parametres invalides");
                    go.println("Donner un cle de recherche pour chercher un document dans tous les étageres: ");
                    se = chercherDocument(gi.readLine().trim());
                    afficherResultatRecherche(se);
                    if (se == null) {
                        go.println("Choisissez le livre a emprunter parmi ces livre:");
                        afficherDocuments();
                    } else {
                        go.println("Choisissez un titre parmi cette liste");
                    }
                    line = gi.readLine();
                    v = null;
                    v = recupererDocument(line);
                }
                if (v != null) {
                    go.println("Donner le CIN de celui auquel le document " + v.titre + " va etre emprunté");
                    line = gi.readLine().trim();  //line = CIN
                    if (estMembre(line)) {
                        go.println("Donner la date de l'emprunt (sous la forme JJ/MM/AAAA)");
                        lines = gi.readLine().split("/");
                        try {
                            Date da = new Date(Integer.parseInt(lines[2]) - 1900, Integer.parseInt(lines[1]) - 1, Integer.parseInt(lines[0]));
                            emprunter(v, recupererAdherant(line), da);
                        } catch (Exception e) {
                            Date da = new Date();
                            emprunter(v, recupererAdherant(line), da);
                            go.println("Date invalide, date actuelle va etre prise comme date de l'emprunt");
                        }
                    } else {
                        go.println("CIN invalide. operation echouée");
                    }
                } else {
                    go.println("Aucun livre avec ce titre");
                }
            } else if (input == 4) {
                go.println("Donner le CIN de celui qui va retourner un livre");
                line = gi.readLine().trim();
                if (estMembre(line)) {
                    Adherant a = recupererAdherant(line);
                    go.println("Choisissez le livre à retourner parmi ceux empruntés par " + a.nom);
                    a.afficherEmpruntes();
                    line = gi.readLine();
                    Document v = null;
                    for (Document d : a.emprunte) {
                        if (d.titre.equals(line)) {
                            v = d;
                        }
                    }
                    if (v != null) {
                        retourner(v, a);
                    } else {
                        go.println("Aucun livre emprunté par " + a.nom +" avec ce nom");
                    }
                } else {
                    go.println("CIN invalide. operation echouée");
                }
            } else if (input == 5) {
                go.println("Le nombre total des documents dans la bibliotheque est = " + Document.nbrDoc);
            } else if (input == 6) {
                go.println("Nombre total des volumes = " + Volume.nbrVol);
                go.println("Nombre total des livres = " + Livre.nbrLiv);
                go.println("Nombre total des memoires = " + Memoire.nbrMem);
            } else if (input == 7) {
                go.println("Donner le CIN de celui que vous voulez afficher les livres empruntés par lui : ");
                line = gi.readLine().trim();
                if (estMembre(line)) {
                    recupererAdherant(line).afficherEmpruntes();
                } else {
                    go.println("CIN invalide");
                }
            } else if (input == 8) {
                afficherEmpruntes();
            }
        }
    }
}
