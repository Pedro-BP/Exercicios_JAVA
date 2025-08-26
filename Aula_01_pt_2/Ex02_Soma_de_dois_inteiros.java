package Aula_01_pt_2;

import java.util.Scanner;

public class Ex02_Soma_de_dois_inteiros {
    
    /*2) Soma de dois inteiros: Leia dois inteiros e mostre a soma.*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite outro número para somar: ");
        int n2 = teclado.nextInt();
        System.out.println("A soma entre os dois números corresponde a: "+(n1+n2));
    }
}
