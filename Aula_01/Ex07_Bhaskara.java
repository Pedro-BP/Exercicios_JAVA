package Aula_01;

import java.util.Scanner;

public class Ex07_Bhaskara {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = teclado.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = teclado.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = teclado.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("O resultado para x1 é: " + x1);
            System.out.println("O resultado para x2 é: " + x2);
        }
    }
}
