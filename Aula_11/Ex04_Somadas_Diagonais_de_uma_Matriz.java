package Aula_11;

public class Ex04_Somadas_Diagonais_de_uma_Matriz {

/*  4. Somadas Diagonais* de uma Matriz: Dada uma matriz 3x3, calcule a soma 
    dos elementos da diagonal principal e da diagonal secundária. 
    * somaSecundaria += matriz[i][2-i];
*/    
    public static void main(String[] args) {
        
        int[][] matriz = {
            { 1, 2, 3},  //Ds = 15
            { 4, 5, 6},  
            { 7, 8, 9}   //Dp = 15
        };
        
        int somaDp = 0;
        int somaDs = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    somaDp += matriz[i][j];
                }
                
                if (i==0 && j==2 || i==1 && j==1 || i==2 && j==0) {
                    somaDs += matriz[i][j];
                }
            }
        }
        
        System.out.println("A soma da diagonal Principal é: "+somaDp);
        System.out.println("A soma da diagonal Segundaria é: "+somaDs);
        System.out.println("A soma das duas diagonais é: "+(somaDp+somaDs));
    }
}
