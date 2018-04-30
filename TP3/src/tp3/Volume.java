package tp3;

public class Volume extends Document {

    String auteur;
    static int nbrVol = 0;

    public Volume(String t, String a) {
        super(t);
        auteur = a;
        nbrVol++;
    }
}
