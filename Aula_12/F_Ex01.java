package Aula_12;

import java.util.Scanner;

public class F_Ex01 {

/*  1. Crie um método que receba dois números inteiros como parâmetros e retorne 
    a soma deles. Implemente um programa que utilize este método para somar dois
    números fornecidos pelo usuário.
*/
    //Metodo para soma:
    public static double mSoma(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para a somar: ");
        double a = sc.nextDouble();

        System.out.print("Digite o número que deseja somar: ");
        double b = sc.nextDouble();

        System.out.println("A soma de " + a + " + " + b + " = " + mSoma(a, b));
    }
}
