package Aula_07;

import java.util.Scanner;

public class Ex04_Menu_de_Bebidas {

/*  Exercício 4: Menu de Bebidas
    Criar um algoritmo que simule um menu de bebidas com as opções: 
    1- Refrigerante, 2- Suco, 3- Água. 
    O programa deve ler a escolha do usuário e exibir a bebida selecionada.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu de Bebidas:");
        System.out.println("1 - Refrigerante");
        System.out.println("2 - Suco");
        System.out.println("3 - Água");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1: System.out.println("Você escolheu Refrigerante!"); break;
            case 2: System.out.println("Você escolheu Suco!"); break;
            case 3: System.out.println("Você escolheu Água!"); break;
            default: System.out.println("Opção inválida!");
        }
    }
}
