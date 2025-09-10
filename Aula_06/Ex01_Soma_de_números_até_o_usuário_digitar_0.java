package Aula_06;

import java.util.Scanner;

public class Ex01_Soma_de_números_até_o_usuário_digitar_0 {

/*  Exercício 1: Soma de números até o usuário digitar 0
    Criar um algoritmo que leia vários números inteiros e calcule a soma deles, 
    parando quando o usuário digitar o número 0.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n, soma = 0;
        
        do {
            System.out.print("Digite um número inteiro para somar (0 para sair): ");
            n = sc.nextInt();
            soma += n;
        } while (n != 0);
        System.out.println("A soma dos números digitados é: "+soma);
    }
}
