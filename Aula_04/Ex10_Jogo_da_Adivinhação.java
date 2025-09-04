package Aula_04;

import java.util.Random;
import java.util.Scanner;

public class Ex10_Jogo_da_Adivinhação {

/*  10. Jogo de Adivinhação: DESAFIO

    Gerar um número aleatório entre 1 e 100 e solicitar ao usuário que adivinhe 
    o número, fornecendo dicas (maior ou menor) a cada tentativa. Limitar o 
    número de tentativas a 7.
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        
        Random random = new Random();
        
        int nA = random.nextInt(100) + 1;
        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o número que acha que é: ");
            int n = sc.nextInt();
            
            if (n < nA) {
                System.out.println("O número desejado é MAIOR.");
            } else if (n > nA) {
                System.out.println("O número desejado é MENOR.");
            } else if (n == nA) {
                System.out.println("Você acertou!");
                break;
            }
        }
    }
}
