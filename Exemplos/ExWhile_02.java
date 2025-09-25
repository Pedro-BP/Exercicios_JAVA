package Exemplos;

import java.util.Scanner;

public class ExWhile_02 {

// Somador Numérico    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1, soma = 0, numero, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        while (cont <= 5) {
            System.out.print("Digite o " + cont + "º valor:");
            numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
            soma += numero;
            cont++;
        }

        System.out.println("A soma de todos os valores é " + soma);
        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);
    }
}
