/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houssem_zoubeidi_tp3;

/**
 *
 * @author Lenovo-G510
 */


import java.util.ArrayList;

public class Etagere {

    public ArrayList<Document> contenu = new ArrayList<>();
    
    
    public void ajouterDocument(Document d) {
        contenu.add(d);
    }

    public void retirerDocument(String titre) {
        boolean found = false;
        for (Document d : contenu) {
            if (titre.equals(d.title)) {
                contenu.remove(d);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Aucun document avec le titre " + titre);
        }
    }
    
    public Document recupererDocument(int position){
        return contenu.get(position-1);
    }
    
    public int nombreDocuments(){
        return contenu.size();
    }
    
    public boolean estPresent(Document d){
        return contenu.contains(d);
    }
    
    public boolean estPresent(String titre){
        for (Document d : contenu) {
            if (titre.equals(d.title)) {
                return true;
            }
        }
        return false;
    }
    
    public void afficherEtagere(){
        for (Document d : contenu){
            System.out.println(d.title);
        }
    }
}
