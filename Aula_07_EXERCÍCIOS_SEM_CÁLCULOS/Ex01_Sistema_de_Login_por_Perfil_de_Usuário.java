package Aula_07_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex01_Sistema_de_Login_por_Perfil_de_Usuário {

/*  Exercício 1: Sistema de Login por Perfil de Usuário
    Crie um programa que peça ao usuário o tipo de perfil de login:

    1 → Administrador
    2 → Editor
    3 → Visitante

    Use switch-case para exibir as permissões de cada perfil:

    Administrador: pode criar, editar e excluir.
    Editor: pode criar e editar.
    Visitante: apenas visualizar.

    Se for digitada uma opção inválida, mostre mensagem de erro.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o tipo de perfil de login?");
        System.out.println("1 -> Administrador");
        System.out.println("2 -> Editor");
        System.out.println("3 -> Visitante");
        System.out.print("Escolha o login: ");
        int opc = sc.nextInt();
        
        String msg;
        
        switch (opc) {
            case 1:
                msg = "Administrador: pode criar, editar e excluir."; break;
            case 2: 
                msg = "Editor: pode criar e editar."; break;
            case 3: 
                msg = "Visitante: apenas visualizar."; break;
            default:
                msg = "Opção de login inválido."; break;
        }
        
        System.out.println("As permições do seu login...");
        System.out.println(msg);
    }
}
