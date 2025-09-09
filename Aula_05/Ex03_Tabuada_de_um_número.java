package Aula_05;

import java.util.Scanner;

public class Ex03_Tabuada_de_um_número {

/*  Exercício 3: Tabuada de um número
    Criar um algoritmo que exibe a tabuada de um número inteiro positivo 
    informado pelo usuário. O programa deve validar se o número digitado 
    é positivo antes de exibir a tabuada.
*/
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.print("Digite um número positivo: ");
        numero = sc.nextInt();

        if (numero > 0) {
            int i = 1;
            while (i <= 10) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++;
            }
        } else {
            System.out.println("Número inválido. Apenas positivos.");
        }

        sc.close();
    }
}
