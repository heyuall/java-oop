package tp3;

import java.util.Date;

public class Livre extends Volume {

    Date emprunt;
    Date retour = new Date(0, 0, 1);
    static int nbrLiv = 0;

    public Livre(String t, String a) {
        super(t, a);
        nbrLiv++;
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
