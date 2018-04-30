/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

public class Volume extends Document {

    String auteur;
    static int nbrVol;

    public Volume(String t, String a) {
        super(t);
        this.auteur = a;
        nbrVol++;
    }
}
