package Exemplos;

import java.util.Scanner;

public class ExWhile_03 {

// Contagem Inteligente.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("+----------------------+");
        System.out.println("| CONTAGEM INTELIGENTE |");
        System.out.println("+----------------------+");
        System.out.print("Inicio: ");
        int inicio = sc.nextInt();
        System.out.print("Fim: ");
        int fim = sc.nextInt();
        System.out.println("+----------------------+");
        System.out.println("|       CONTANDO       |");
        System.out.println("+----------------------+");
        
        if (inicio < fim) {
            int cont = inicio;
            while (cont <= fim) {
                System.out.println(cont+" ");
                cont++;
            }
        } else {
            int cont = inicio;
            while (cont >= fim) {
                System.out.println(cont+" ");
                cont--;
            }
        }
        System.out.println();
    }
}
