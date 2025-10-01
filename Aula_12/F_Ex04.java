package Aula_12;

import java.util.Scanner;

public class F_Ex04 {

/*  4. Crie um método que converta uma temperatura em graus Celsius para
Fahrenheit. Utilize a fórmula F = (C * 9/5) + 32.
*/
    
    //Metodo Fahrenheit
    public static double mFahrenheit(double c) {
        return c*(9/5)+32;
    }
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        double c = sc.nextDouble();
        
        System.out.println(c+" ºC equivale a "+mFahrenheit(c)+" ºF.");
    }
}
