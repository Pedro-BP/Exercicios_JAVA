package Aula_07;

import java.util.Scanner;

public class Ex05_Cálculo_de_IMC_com_CASE {

/*  Exercício 5: Cálculo de IMC com CASE
    Calcular o Índice de Massa Corporal (IMC) de uma pessoa e classificá-la de 
    acordo com a tabela de IMC, utilizando a estrutura CASE.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        int classificacao;
        if (imc < 18.5) {
            classificacao = 1;
        } else if (imc < 25) {
            classificacao = 2;
        } else if (imc < 30) {
            classificacao = 3;
        } else {
            classificacao = 4;
        }

        switch (classificacao) {
            case 1: System.out.println("Classificação: Abaixo do peso"); break;
            case 2: System.out.println("Classificação: Peso normal"); break;
            case 3: System.out.println("Classificação: Sobrepeso"); break;
            case 4: System.out.println("Classificação: Obesidade"); break;
        }
    }
}
