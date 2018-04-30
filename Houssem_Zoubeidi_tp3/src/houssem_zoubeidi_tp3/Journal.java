/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

import java.util.Date;

public class Journal extends Document {

    Date date_parution;

    public Journal(String t, Date p) {
        super(t);
        date_parution = p;
    }
}
