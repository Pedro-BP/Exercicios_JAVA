package Exemplos;

import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º lado: ");
        double l1 = sc.nextDouble();
        System.out.print("Digite o 2º lado: ");
        double l2 = sc.nextDouble();
        System.out.print("Digite o 3º lado: ");
        double l3 = sc.nextDouble();

        boolean tri = (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
        boolean equ = (l1 == l2) && (l2 == l3);
        boolean esc = (l1 != l2) && (l2 != l3) && (l3 != l1);
        boolean iso = (l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1);

        System.out.println("Pode formar um TRIÂNGULO ? " + tri);
        System.out.println("Pode formar um TRIÂNGULO EQUILÁTERO? " + equ);
        System.out.println("Pode formar um TRIÂNGULO ESCALENO? " + esc);
        System.out.println("Pode formar um TRIÂNGULO ISÓSCELES? " + iso);
    }
}
