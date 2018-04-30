/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formesGéometriques;

/**
 *
 * @author Lenovo-G510
 */
import java.util.ArrayList;

public class VectorFormes{
	ArrayList<Forme> liste = new ArrayList<>();

	public void homothetie(double coef){
		for (Forme f : liste){
			f.homothetie( coef);
		}
	}

	public String toString(){
		String s = "";
		for (Forme f : liste){
			s+= f.toString();
		}
                if(liste.size()==1){
		return "La forme existante est \n"+ s;
                }
                else{return "Les forme existantes sont respectivements: \n"+ s;
                }
        }
        
// 1ère méthode pour avoir une méthode add:
    
	public void add(Forme f){
		liste.add(f);
	} 
        
//2ème méthode pour avoir une méthode add:
        //le premierélément ajouté impose le type dans toute la liste:
	public void add1(Forme f)
        {
		if(liste.isEmpty()){
                    liste.add(f);
                }
                else if (f.getClass().getName().equals(liste.get(0).getClass().getName())){
				liste.add(f);
		}
		else{System.out.println("il vous faut le type " +liste.get(0).getClass().getName() );
                
                }
        }  
}
	
		
	
        
        
