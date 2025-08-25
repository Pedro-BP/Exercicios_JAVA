package Aula_01;

import java.util.Scanner;

public class Ex01_Salário_do_Funcionário {

    /* 1. Salário do Funcionário: Crie um programa que pergunte o nome de um 
   funcionário e seu salário. Em seguida, exiba uma mensagem personalizada 
   mostrando o nome do funcionário e seu respectivo salário.               */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o valor do seu salário atual: ");
        double salario = teclado.nextDouble();

        System.out.println("");

        System.out.println("Olá " + nome + ", seu salário é igual a R$" + salario);
    }
}
