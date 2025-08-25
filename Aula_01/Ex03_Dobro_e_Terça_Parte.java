package Aula_01;

import java.util.Scanner;

public class Ex03_Dobro_e_Terça_Parte {

    /*
    3. Dobro e Terça Parte: Escreva um algoritmo que leia um número real e 
    calcule o dobro e a terça parte desse número. Exiba os resultados na tela, 
    formatando a terça parte com quatro casas decimais.
    */
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double n = teclado.nextDouble();
        
        System.out.println("");
        
        System.out.println("Dobro: "+(n*2));
        System.out.printf("Terça parte: %.4f%n",n);
    }
}
