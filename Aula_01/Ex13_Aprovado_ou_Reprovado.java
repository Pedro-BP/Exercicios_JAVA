package Aula_01;

import java.util.Scanner;

public class Ex13_Aprovado_ou_Reprovado {

    /*13. Aprovado ou Reprovado: Escreva um programa que pergunte o nome de um 
    aluno e suas duas notas. Calcule a média e exiba uma mensagem informando se 
    o aluno foi aprovado (média 7 ou superior).*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite o valor da 1º nota: ");
        double n1 = teclado.nextDouble();
        System.out.print("Digite o valor da 2º nota: ");
        double n2 = teclado.nextDouble();
        System.out.println("Olá "+nome+" sua média final é: "+(n1+n2)/2);
    }
    
}
