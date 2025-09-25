package Aula_11;

public class Ex03_Matriz_Transposta {

/*  3. Matriz Transposta*: Dada uma matriz 3x3, crie e exiba a sua matriz 
    transposta (trocar linhas por colunas). *Criar uma nova matriz 3x3 pra 
    armazenar a transporta
*/  
    public static void main(String[] args) {
        
        int[][] m1 = {
            { 1, 1, 1},
            { 2, 2, 2},
            { 3, 3, 3}
        }; 
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int[][] m2 = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m2[i][j] = m1[j][i];
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
