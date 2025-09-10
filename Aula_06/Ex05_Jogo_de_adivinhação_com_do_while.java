package Aula_06;

import java.util.Random;
import java.util.Scanner;

public class Ex05_Jogo_de_adivinhação_com_do_while {

/*  Exercício 5: Jogo de adivinhação com do-while
    Criar um jogo de adivinhação onde o programa gera um número aleatório entre 
    1 e 100, e o usuário tenta adivinhar. O programa deve fornecer dicas (maior 
    ou menor) e contar as tentativas. O jogo termina quando o usuário acerta o 
    número.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1; 
        int tentativa;
        int contador = 0;
        
        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();
            contador++;

            if (tentativa < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            } else if (tentativa > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
            } else {
                System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + contador + " tentativas.");
            }
        } while (tentativa != numeroSecreto);
    }
}
