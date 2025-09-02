package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex02_Saudação_Personalizada {

/*  2. Saudação Personalizada: Crie um programa que pergunte o nome e o turno 
    em que a pessoa estuda (Manhã, Tarde ou Noite) e exiba uma saudação 
    personalizada. DICA: "if (turno.equalsIgnoreCase("
*/    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual seu nome? ");
        String nome = sc.nextLine();
        System.out.print("Olá "+nome+", qual o turque que você estuda (Manhã, Tarde ou Noite)? ");
        String turno = sc.nextLine();

        if (turno.equalsIgnoreCase("manhã") || turno.equalsIgnoreCase("manha")) {
            System.out.println("Bom dia!");
        } else if (turno.equalsIgnoreCase("tarde")) {
            System.out.println("Boa tarde!");
        } else if (turno.equalsIgnoreCase("noite")) {
            System.out.println("Boa noite!");
        }
        
        System.out.println("...");
    }
}
