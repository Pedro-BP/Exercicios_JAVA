package Aula_03;

import java.util.Scanner;

public class Ex07_Análise_de_Aprovação_para_Empréstimo_Imobiliário {

/*  7. Escreva um programa para aprovar ou não o empréstimo bancário para a 
    compra de uma casa. O programa vai perguntar o valor da casa, o salário 
    do comprador e em quantos anos ele vai pagar. Calcule o valor da prestação 
    mensal, sabendo que ela não pode exceder 30% do salário ou então o 
    empréstimo será negado.
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da casa que deseja comprar: ");
        double vCasa = sc.nextDouble();

        System.out.print("Digite quanto ganha de salário: ");
        double sal = sc.nextDouble();

        System.out.print("Digite em quantos anos deseja pagar: ");
        int anos = sc.nextInt();

        double lim = sal * 0.3;
        double parc = vCasa / (anos * 12);

        System.out.printf("Valor da prestação: R$ %.2f%n", parc);
        System.out.printf("Limite permitido: R$ %.2f%n", lim);

        if (parc >= lim) {
            System.out.println("Empréstimo negado!");
        } else {
            System.out.println("Empréstimo aprovado!");
        }
    }
}
