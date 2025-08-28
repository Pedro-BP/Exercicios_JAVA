package Aula_02;

import java.util.Scanner;

public class Ex04_Calcular_a_hipotenusa_de_um_triângulo_retângulo {

/*  Exercício 4 – Calcular a hipotenusa de um triângulo retângulo
    Utiliza funções aritméticas da classe Math para calcular a hipotenusa.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        
        double hip = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        
        System.out.println("A hipotenusa do triângulo corresponde a: "+hip);
    }
}
