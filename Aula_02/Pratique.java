package Aula_02;

import java.util.Scanner;

public class Pratique {

    /*Crie um programa que solicite ao usuário uma informação, utilize 
    parênteses, operadores, funções aritméticas, leitura de dados e variáveis 
    com tipos primitivos.*/
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double valor = teclado.nextDouble();

        double resultado = ((valor * 2) + 10) / 3 + Math.sqrt(valor);

        System.out.println("O resultado do cálculo é: " + resultado);
    }
}
