package Aula_07;

import java.util.Scanner;

public class Ex01_Calculadora_Simples {

/*  Exercício 1: Calculadora Simples
    Criar uma calculadora simples que permita ao usuário escolher entre as 
    operações de soma, subtração, multiplicação e divisão. O programa deve 
    ler dois números e, de acordo com a escolha do usuário, realizar a 
    operação e exibir o resultado.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Resultado: " + (n1 / n2));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
