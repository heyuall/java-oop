
package tp5.Partie1;

public class Jeu {
    
    public static final int BLEU =1,
                            ROUGE = 2;
    public static final String COLOR_MAPPING[] = {" ","B","R"};
    
    
    
    
    
    private int[][] table;
    
    public Jeu(int taille){
        table = new int[taille][taille];
    }
    public Jeu(){
        table = new int[8][8];
    }
    
    public boolean joueCoup(int colonne, int couleur){
        for (int row = 0; row<table.length; row++){
            if (table[row][colonne] == 0){
                table[row][colonne] = couleur;
                return true;
            }
        }
        return false;
    }
    
    public boolean cherche4(){
        for (int row = 0; row<table.length-3; row++){
            for (int col = 0;col<table.length; col++){
                if (table[row][col] == table[row+1][col] && table[row+2][col] == table[row][col] && table[row][col]!=0){
                    System.out.println("Joueur ayant la couleur "+COLOR_MAPPING[table[row][col]]+" a gagné cette partie!");
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean estPlein(){
        for (int col = 0; col<table.length; col++){
            if (table[table.length-1][col]==0){ return false; }
        }
        System.out.println("Jeu terminée avec egalité");
        return true;
    }
    
    public void print(){
        for (int row = table.length-1; row>=0; row--){
            for (int col = 0; col<table.length; col++){
                System.out.print(COLOR_MAPPING[table[row][col]]+"\t");
            }
            System.out.println();
        }
        for (int k = 0; k<table.length; k++){
            System.out.print("-\t");
        }
        System.out.println();
        for (int k = 0; k<table.length; k++){
            System.out.print((k+1)+"\t");
        }
        System.out.println();
    }
    
    public int[][] getTable(){
        return table;
    }
    
}
