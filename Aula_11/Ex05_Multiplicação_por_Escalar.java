package Aula_11;

import java.util.Scanner;

public class Ex05_Multiplicação_por_Escalar {

/*  5. Multiplicação por Escalar: Multiplique todos os elementos de uma matriz 
    3x3 por um número escalar fornecido pelo usuário / matriz[i][j] *= escalar;
*/  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz = {
            { 1, 2, 3},
            { 4, 5, 6},
            { 7, 8, 9}
        };
        
        System.out.print("Digite o número para multiplicar a matriz: ");
        int escalar = sc.nextInt();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;
            }
        }
        
        System.out.println("Matriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
