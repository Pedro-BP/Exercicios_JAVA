package Aula_11;

public class Ex01_Somados_Elementos_de_uma_Matriz {

/*  1. Somados Elementos de uma Matriz: Dada uma matriz 3x3 de inteiros, some 
    todos os elementos da matriz e exiba o resultado.
*/
    public static void main(String[] args) {
    
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int soma = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }
        
        System.out.println("A soma total da Matriz é: "+soma);
    }
}
