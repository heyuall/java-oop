/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_ex2;

/**
 *
 * @author Lenovo-G510
 */
public class Robot {

    int x, y;
    String orientation;

    public Robot() {
        orientation = "Nord";
        this.x = 0;
        this.y = 0;
    }

    public void TourneraDroite() {
        if (this.orientation == "Nord") {
            this.orientation = "Est";
        } else if (this.orientation == "Est") {
            this.orientation = "Sud";
        } else if (this.orientation == "Sud") {
            this.orientation = "Ouest";
        } else if (this.orientation == "Ouest") {
            this.orientation = "Nord";
        }

    }

    public void Avancer() {
        switch (this.orientation) {
            case ("Nord"):
                this.x = this.x + 1;
                break;
            case ("Est"):
                this.y = this.y + 1;
                break;
            case ("Sud"):
                this.x = this.x - 1;
                break;
            case ("Ouest"):
                this.y = this.y - 1;
                break;

        }

    }

    public void AffichePosition() {
        System.out.println("la position dans le plan cartésien est:\n(x= " + this.x + " y= " + this.y + ")");
    }

}
