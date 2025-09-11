package Aula_07_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex04_Menu_de_Controle_de_Dispositivos_Inteligentes {

/*  Exercício 4: Menu de Controle de Dispositivos Inteligentes
    Crie um programa que exiba um menu para controlar dispositivos de uma casa 
    inteligente:
    1 - Acender luzes
    2 - Apagar luzes
    3 - Ligar TV
    4 - Desligar TV
    5 - Abrir portão
    6 - Fechar portão

    Cada opção deve exibir a ação correspondente. Se for digitado um número 
    inválido, exiba “Comando inválido.”
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Menu de Controle de Dispositivos Inteligentes ===");
        System.out.println("1 - Acender luzes");
        System.out.println("2 - Apagar luzes");
        System.out.println("3 - Ligar TV");
        System.out.println("4 - Desligar TV");
        System.out.println("5 - Abrir portão");
        System.out.println("6 - Fechar portão");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("As luzes foram acesas.");
                break;
            case 2:
                System.out.println("As luzes foram apagadas.");
                break;
            case 3:
                System.out.println("A TV foi ligada.");
                break;
            case 4:
                System.out.println("A TV foi desligada.");
                break;
            case 5:
                System.out.println("O portão está sendo aberto.");
                break;
            case 6:
                System.out.println("O portão está sendo fechado.");
                break;
            default:
                System.out.println("Comando inválido.");
                break;
        }
    }
}
