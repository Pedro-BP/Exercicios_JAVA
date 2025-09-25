package Exemplos;

import java.util.Scanner;

public class Matriz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] jogo = new char[3][3];
        
        //Inicializa vazio
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = '-';
            }
        }
        
        //Usuário digita 3 jogadas
        for (int k = 0; k < 10; k++) {
            System.out.print("Digite a linha (0-2): ");
            int linha = sc.nextInt();
            System.out.print("Digite a coluna (0-2): ");
            int coluna = sc.nextInt();
            System.out.print("Digite X ou O: ");
            char simbulo = sc.next().charAt(0);
            
            jogo[linha][coluna] = simbulo;
            
            //Mostrar o tabuleiro
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(jogo[i][j]+"");
                }
                System.out.println();
            }
        }
    }
}
