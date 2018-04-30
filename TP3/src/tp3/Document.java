package tp3;

import java.util.Date;

public class Document {

    String titre;
    static int nbrDoc = 0;

    public Document(String t) {
        titre = t;
        nbrDoc++;
    }

    public boolean emprunter(Date d) {
        System.out.println("ce document est non empruntable");
        return false;
    }

}
