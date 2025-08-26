package Aula_01_pt_2;

import java.util.Scanner;

public class Ex04_Conversor_Celsius_Fahrenheit {

    /*4) Conversor Celsius → Fahrenheit: Leia a temperatura em °C e exiba em 
    °F (F = C * 9/5 + 32).*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double C = teclado.nextDouble();
        
        double F = C*(9/5)+32;
        
        System.out.println(C+"ºC = "+F+"ºF");
    }
}
