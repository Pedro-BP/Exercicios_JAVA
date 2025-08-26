package Aula_01_pt_2;

import java.util.Scanner;

public class Ex01_Cumprimento_simples {
    
    /*1) Cumprimento simples: Leia seu nome completo e imprima 'Olá, ! 
    Bem-vindo(a) ao Java.'*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Olá, "+nome+"! Bem-vindo(a) ao Java.");
    }
}
