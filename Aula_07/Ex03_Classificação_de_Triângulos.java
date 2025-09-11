package Aula_07;

import java.util.Scanner;

public class Ex03_Classificação_de_Triângulos {

/*  Exercício 3: Classificação de Triângulos
    Criar um algoritmo que leia três lados de um triângulo e classifique-o 
    como equilátero, isósceles ou escaleno.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int a = sc.nextInt();
        System.out.print("Digite o lado B: ");
        int b = sc.nextInt();
        System.out.print("Digite o lado C: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) { 
            switch ((a == b ? 1 : 0) + (a == c ? 1 : 0) + (b == c ? 1 : 0)) {
                case 3: 
                    System.out.println("Triângulo Equilátero");
                    break;
                case 1: 
                    System.out.println("Triângulo Isósceles");
                    break;
                default: 
                    System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os lados não formam um triângulo válido!");
        }
    }
}
