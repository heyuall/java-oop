package tp3;

import java.util.Date;

public class Journal extends Document {

    Date date_parution;

    public Journal(String t, Date p) {
        super(t);
        date_parution = p;
    }
}
