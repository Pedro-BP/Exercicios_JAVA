package Aula_05;

import java.util.Scanner;

public class Ex04_Calculadora_de_fatorial {

/*  Exercício 4:  Calculadora de fatorial
    Criar um algoritmo que calcula o fatorial de um número inteiro não negativo 
    informado pelo usuário. O programa deve validar se o número digitado é não 
    negativo. 
    ## dica: fatorial *= contador; ##
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número não negativo: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            int fatorial = 1;
            int i = 1;

            while (i <= numero) {
                fatorial *= i;
                i++;
            }

            System.out.println("Fatorial de " + numero + " é: " + fatorial);
        } else {
            System.out.println("Número inválido. Apenas não negativos.");
        }
    }
}
