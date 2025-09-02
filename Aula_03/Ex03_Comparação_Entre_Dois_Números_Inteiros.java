package Aula_03;

import java.util.Scanner;

public class Ex03_Comparação_Entre_Dois_Números_Inteiros {

/*  3. Escreva um algoritmo que leia dois números inteiros e compare-os, 
    mostrando na tela uma das mensagens abaixo:
    - O primeiro valor é o maior
    - O segundo valor é o maior
    - Não existe valor maior, os dois são iguais
*/  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        
        if (a > b) {
            System.out.println("O primeiro valor é o maior.");
        } else if (a < b) {
            System.out.println("O segundo valor é o maior.");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais.");
        }
    }
}
