package Aula_07;

import java.util.Scanner;

public class Ex02_Dia_da_Semana {

/*  Exercício 2: Dia da Semana
    Criar um algoritmo que leia um número de 1 a 7 e exiba o dia da semana 
    correspondente (1-Domingo, 2-Segunda,..., 7-Sábado).
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7:");
        int dia = sc.nextInt();

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda-feira"); break;
            case 3: System.out.println("Terça-feira"); break;
            case 4: System.out.println("Quarta-feira"); break;
            case 5: System.out.println("Quinta-feira"); break;
            case 6: System.out.println("Sexta-feira"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Número inválido!");
        }
    }
}
