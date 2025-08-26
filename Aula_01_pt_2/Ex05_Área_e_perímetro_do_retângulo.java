package Aula_01_pt_2;

import java.util.Scanner;

public class Ex05_Área_e_perímetro_do_retângulo {

    /*5) Área e perímetro do retângulo: Leia base e altura e mostre área e 
    perímetro.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        double base = teclado.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = teclado.nextDouble();

        System.out.println("O perímetro do retângulo corresponde a: " + (base * altura) + " cm");
    }
}
