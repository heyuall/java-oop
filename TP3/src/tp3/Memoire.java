package tp3;

import java.util.Date;

public class Memoire extends Volume {

    Enseignant jury[] = new Enseignant[3];
    Date date_soutenance;
    Date emprunt;
    Date retour = new Date(); //date actuelle
    static int nbrMem = 0;

    public Memoire(String t, String a) {
        super(t, a);
        nbrMem++;
    }

    public Memoire(String t, String a, Date d, Enseignant J[]) {
        super(t, a);
        date_soutenance = d;
        jury = J;
        nbrMem++;
    }
    
    public void ajouterJury(Enseignant e){
        int k = 0;
        for (Enseignant ens : jury){
            if (ens == null){ jury[k] = e; break; }
            k++;
        }
    }
    
    public void modifierDate(Date d){
        date_soutenance = d;
    }

    public boolean emprunter(Date d) {
        emprunt = d;
        retour.setDate(d.getDate() + 30); //par default, la date de retour est 30 apres date de l'emprunt
        retour.setMonth(d.getMonth());
        retour.setYear(d.getYear());
        return true;
    }

    public void prolonger(int prolongement) {
        retour.setDate(retour.getDate() + prolongement);
    }

}
