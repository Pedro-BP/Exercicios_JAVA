package Aula_05;

import java.util.Scanner;

public class Ex01_Cálculo_da_média_de_idade_de_uma_turma {

/*  Exercício 1: Cálculo da média de idade de uma turma
    Desenvolver um algoritmo que calcula a média de idade dos alunos de uma 
    turma. O usuário deve informar a idade de cada aluno e digitar um valor 
    negativo para indicar o fim da entrada de dados. 
    ## dica: pode ser usado While e if-else ##
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, soma = 0, contador = 0;
        double media;

        System.out.println("Digite a idade dos alunos (valor negativo para encerrar): ");
        idade = sc.nextInt();

        while (idade >= 0) {
            soma += idade;
            contador++;
            idade = sc.nextInt();
        }

        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade válida foi informada.");
        }
    }
}
