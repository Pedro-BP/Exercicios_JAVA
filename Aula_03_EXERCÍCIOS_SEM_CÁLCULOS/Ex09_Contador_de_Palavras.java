package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex09_Contador_de_Palavras {

/*  9. Contador de Palavras: Faça um programa que leia uma frase e informe 
    quantas palavras ela contém (palavras separadas por espaço). 
*/  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().trim();
        
        if (frase.isEmpty()) {
            System.out.println("A frase está vazia.");
        } else {
            String[]palavra = frase.split("\\s+");
            System.out.println("Número de palavras"+palavra.length);
        }
    }
}
