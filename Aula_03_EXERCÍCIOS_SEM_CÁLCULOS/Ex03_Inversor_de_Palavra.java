package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex03_Inversor_de_Palavra {

/*  3. Inversor de Palavra: Faça um programa que leia uma palavra e a exiba 
    invertida. 
    DICA:" String invertida = new StringBuilder(palavra).reverse().toString();"
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        
        String invertida = new StringBuilder(palavra).reverse().toString();
        
        System.out.println("A palavra invertida fica assim: "+invertida);
    }
}
