package Aula_11;

public class Ex02_Matriz_Identidade {

/*  2. Matriz Identidade: Verifique se uma matriz 3x3 é uma matriz identidade 
    (uma matriz onde os elementos da diagonal principal são 1 e todos os outros 
    são 0).
*/
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        
        //Verifica se é 0 ou 1
        boolean identidade = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    identidade = false;
                    break;
                }
            }
        }

        if (identidade) {
            System.out.println("É uma matriz identidade!");
        } else {
            System.out.println("Não é uma matriz identidade!");
        }
    }
}
