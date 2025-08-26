package Aula_01_pt_2;

import java.util.Scanner;

public class Ex09_Juros_simples {

    /*9) Juros simples: Leia capital (C), taxa em % ao mês (i) e tempo (n). 
    Mostre o montante (M = C * (1+ i/100 * n)).*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite qual o seu capital: ");
        double c = teclado.nextDouble();
        System.out.print("Digite a taxa em % ao mês: ");
        double i = teclado.nextDouble();
        System.out.print("Digite quantos meses vai investir: ");
        double n = teclado.nextDouble();
        
        double M = c*(1+(i/100)*n);
        
        System.out.printf("O montante é R$ %.2f%n",M);
    }
}
