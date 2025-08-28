package Aula_02;

import java.util.Scanner;

public class Ex05_Verificar_se_um_número_está_entre_10_e_20 {

/*  Exercício 5 – Verificar se um número está entre 10 e 20
    Utiliza operadores relacionais e lógicos para checar o intervalo.
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        boolean inter = n >= 10 && n <= 20;
        
        System.out.println("O número está entre 10 e 20? "+inter);
    }
}
