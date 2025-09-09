package Aula_05;

import java.util.Random;
import java.util.Scanner;

public class Ex05_Jogo_de_par_ou_ímpar {

/*  Exercício 5: Jogo de par ou ímpar
    Criar um jogo de par ou ímpar contra o computador. O usuário escolhe entre 
    par ou ímpar e digita um número de 0 a 5. O computador gera um número 
    aleatório de 0 a 5, e o programa verifica quem ganhou a rodada. O jogo 
    continua até que o usuário digite "sair" para encerrar.
*/    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Digite 'par' ou 'impar' (ou 'sair' para encerrar): ");
            String escolha = sc.nextLine().toLowerCase();

            if (escolha.equals("sair")) {
                System.out.println("Jogo encerrado!");
                break;
            }

            if (!escolha.equals("par") && !escolha.equals("impar")) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }

            System.out.print("Digite um número de 0 a 5: ");
            int numeroUsuario = sc.nextInt();
            sc.nextLine();

            if (numeroUsuario < 0 || numeroUsuario > 5) {
                System.out.println("Número inválido! Apenas entre 0 e 5.");
                continue;
            }

            int numeroComputador = random.nextInt(6);
            int soma = numeroUsuario + numeroComputador;

            System.out.println("Você jogou: " + numeroUsuario);
            System.out.println("Computador jogou: " + numeroComputador);
            System.out.println("Soma = " + soma);

            boolean deuPar = soma % 2 == 0;

            if ((deuPar && escolha.equals("par")) || (!deuPar && escolha.equals("impar"))) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Computador venceu!");
            }
            System.out.println("----------------------------");
        }
    }
}

