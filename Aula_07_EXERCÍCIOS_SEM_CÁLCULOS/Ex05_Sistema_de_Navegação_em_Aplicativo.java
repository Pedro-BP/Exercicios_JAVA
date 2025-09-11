package Aula_07_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex05_Sistema_de_Navegação_em_Aplicativo {

/*  Exercício 5: Sistema de Navegação em Aplicativo
    Implemente um programa que simule a navegação entre páginas de um 
    aplicativo:
    1 - Página inicial  
    2 - Perfil
    3 - Configurações
    4 - Notificações
    5 - Sair

    Cada opção deve mostrar a mensagem “Você está na página: …”. Se o usuário 
    escolher “Sair”, mostre “Aplicativo encerrado.” e finalize o programa.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Menu de Navegação ===");
            System.out.println("1 - Página inicial");
            System.out.println("2 - Perfil");
            System.out.println("3 - Configurações");
            System.out.println("4 - Notificações");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você está na página: Página inicial");
                    break;
                case 2:
                    System.out.println("Você está na página: Perfil");
                    break;
                case 3:
                    System.out.println("Você está na página: Configurações");
                    break;
                case 4:
                    System.out.println("Você está na página: Notificações");
                    break;
                case 5:
                    System.out.println("Aplicativo encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opcao != 5);
    }
}
