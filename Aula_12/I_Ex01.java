package Aula_12;

import java.util.Scanner;

public class I_Ex01 {

/*  1. Crie um método que receba uma string e retorne true se ela for um 
    palíndromo (ou seja, se a string for igual quando lida de trás para frente) 
    e false caso contrário.
*/    
    
    // Método palíndromo
    public static boolean mPalindromo(String palavra) {
        palavra = palavra.toLowerCase();

        String invertida = new StringBuilder(palavra).reverse().toString();

        return palavra.equals(invertida);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine(); 

	System.out.print("A palavra "+palavra+" é um palíndromo? "+mPalindromo(palavra));
    }
}