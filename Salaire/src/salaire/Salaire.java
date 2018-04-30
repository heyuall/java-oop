/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaire;

import java.util.TreeSet;

/**
 *
 * @author Lenovo-G510
 */
public class Salaire {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //TreeSet/HashSet/HashMap/TreeMap
   
         /* TreeSet<Integer> tree=new TreeSet<>();
    tree.add(2);
    tree.add(3);
    tree.add(2);
    tree.add(8);
    
        System.out.println(tree);
*/
         
         Personnel p=new Personnel();
         p.ajouterEmploye(new Vendeur("pierre","Business",54,"1995",30000));
         p.ajouterEmploye(new Representant("Léon" ,"Vendtout",25,"2001",20000));
         p.ajouterEmploye(new Technicien("Yves","Bosseur",28,"1998",1000));
         p.ajouterEmploye(new Manutentionnaire("Jeanne","Stocketout", 32,"1998",45));
         p.ajouterEmploye(new TechnARisque("Jean","Flippe",28,"2000",1000));
         p.ajouterEmploye(new ManutARisque("A1","Abordage", 30,"2001",45));
         p.afficheSalaire();
         System.out.println("le Salaire moyen dans l'entreprise est de "+(int)(p.afficheSalaireMoy())+" dinars");
    }
}
    
    

