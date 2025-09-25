package Exemplos;

import java.util.Scanner;

public class Contador1a10 {

    public static void main(String[] args) {
        
        /*Contador crescente
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/ 
        
        /*Contador decrescente
        for (int i = 10; i >= 1; i-=3) {
            System.out.println(i);
        }*/

        /* Ler 5 valores digitados pelo usuário e exibir a soma total
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i < 5; i++) {
            System.out.print("Digite um valor: ");
            int v = sc.nextInt();
            soma += v; //soma = soma + v
        }
        System.out.println("A soma do valor é "+soma);
        */
        
        /* Tabuada
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }*/
        
        /*Mostrar quantos valores digitados estão entre 0 e 10, após 6 digitos.
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int somaImpares = 0;
        for (int i = 0; i <= 6; i++) {
            System.out.print("Digite um valor: ");
            int v = sc.nextInt();
            if (v >= 0 && v <= 10) {
                cont++;
                if (v % 2 == 1) {
                    somaImpares += v;
                }
            }
        }
        System.out.println("Ao todo foram "+cont+" valores de 0 a 10.");
        System.out.println("Nesse intervalo, a soma dos impares foi "+somaImpares);
        */
    }
}
