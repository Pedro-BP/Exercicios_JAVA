package Exemplos;

import java.util.Scanner;

public class Funcoes_aritmeticas {

    public static void main(String[] args) {
        
        //Valor Absoluto
        int a = Math.abs(-50);
        System.out.println(a);
        
        //Exponencial
        double b = Math.pow(9,5);
        System.out.println(b);
        
        //Raiz quadrada
        double c = Math.sqrt(81);
        System.out.println(c);
        
        //Graus para Radianos
        double d = Math.toRadians(90);
        System.out.println(d);
        
        //Conversor de Seno
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um ângulo: ");
        double angulo = teclado.nextDouble();
        double s = Math.sin(Math.toRadians(angulo));
        System.out.println("O seno de "+angulo+" é igual a "+s);
    }
}
