package Aula_01_pt_2;

import java.util.Scanner;

public class Ex06_Área_do_círculo {

    /*6) Área do círculo: Leia o raio e mostre a área do círculo (A = πr2).*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = teclado.nextDouble();

        double A = 3.14 * (raio * raio);

        System.out.println("A área do círculo corresponde a: " + A);
    }
}
