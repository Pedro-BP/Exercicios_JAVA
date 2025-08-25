package Aula_01;

import java.util.Scanner;

public class Ex02_Antecessor_e_Sucessor {
    
    /* 2. Antecessor e Sucessor: Faça um programa que leia um número inteiro e 
       mostre na tela o seu antecessor e sucessor. */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = teclado.nextInt();
        
        System.out.println("");
        
        System.out.println("Número digitado: "+n);
        System.out.println("Antecessor: "+(n-1));
        System.out.println("Sucessor: "+(n+1));
    }
}
