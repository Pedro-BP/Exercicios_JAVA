package Aula_01_pt_2;

import java.util.Scanner;

public class Ex03_Média_aritmética {
    
    /*3) Média aritmética: Leia três números reais e mostre a média aritmética.*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o 1º valor: ");
        double n1 = teclado.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double n2 = teclado.nextDouble();
        System.out.print("Digite o 3º valor: ");
        double n3 = teclado.nextDouble();
        
        double media = (n1+n2+n3)/3;
        
        System.out.println("A média aritmética vale: "+media);
    }
}
