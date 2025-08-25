package Aula_01;

import java.util.Scanner;

public class Ex10_Salário_do_Cupincha {

    /*10. Salário do Cupincha: O Cupincha, mascote do nosso time, precisa 
    calcular seu novo salário! Ele ganha R$ 25 por hora e trabalha 8 horas por 
    dia. Crie um programa que pergunte quantos dias ele trabalhou e calcule seu 
    novo salário.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite quantos dias você trabalhou: ");
        double dias = teclado.nextDouble();

        double salario = (25 * 8) * dias;

        System.out.printf("Seu novo salário é R$ %.2f%n", salario);
    }
}
