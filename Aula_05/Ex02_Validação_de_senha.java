package Aula_05;

import java.util.Scanner;

public class Ex02_Validação_de_senha {

/*  Exercício 2: Validação de senha
    Criar um algoritmo que solicita uma senha ao usuário e verifica se ela é 
    igual à senha correta "1234". O programa deve continuar solicitando a 
    senha até que o usuário digite a senha correta. 
    ## dica: não (!) e equals. ##
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "";
        final String SENHA_CORRETA = "1234";

        while (!senha.equals(SENHA_CORRETA)) {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        }

        System.out.println("Senha correta! Acesso permitido.");
        sc.close();
    }
}
