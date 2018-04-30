/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

import java.util.Date;

public class Document {

    String title;
    static int nbr_total = 0;
    int id;

    public Document(String t) {
        this.title = t;
        nbr_total++;
        this.id=nbr_total;
    }

    public boolean emprunter() {
        System.out.println("impossible d'emprunter ce document");
        return false;
    }

}
