package tp3;

import java.util.ArrayList;
import java.util.Date;

public class Adherant {

    ArrayList<Document> emprunte = new ArrayList<>();
    String nom;
    String cin; //Cin

    public Adherant(String nom, String CIN) {
        this.nom = nom;
        cin = CIN + "";
    }

    public boolean emprunter(Document v, Date d) {
        if (emprunte.size() <= 3) {
            if (v.emprunter(d)) {
                emprunte.add(v);
                return true;
            }
            else{ return false; }
        } else {
            System.out.println("interdit d'emprunter plus que 3 volumes");
            return false;
        }
    }

    public void retourner(Document v) {
        if (!emprunte.isEmpty()) {
            emprunte.remove(v);
        } else {
            System.out.println("aucun livre emprunté par " + nom);
        }
    }

    public void afficherEmpruntes() {
        if (!emprunte.isEmpty()) {
            for (Document d : emprunte) {
                System.out.println("| " + d.titre);
            }
        } else {
            System.out.println("aucun livre emprunté par " + nom);
        }
    }
}
