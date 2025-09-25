package Aula_11;

public class Ex06_Subtração_de_Matrizes {

/*  6. Subtração de Matrizes: Dadas duas matrizes 3x3, calcule a matriz 
    resultante da subtração da primeira pela segunda e exiba o resultado. 
    / subtracao[i][j] = matriz[i][j] - matriz[i][j];
*/  
    public static void main(String[] args) {
        
        int[][] m1 = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };
        
        int[][] m2 = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };
        
        int[][] subtracao = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                subtracao[i][j] = m1[i][j] - m2[i][j];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(subtracao[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
