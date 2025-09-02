package Aula_03;

import java.util.Scanner;

public class Ex06_Reajuste_Salarial_por_Tempo_de_Serviço {

/*  6. Desenvolva um programa que leia o nome de um funcionário, seu salário, 
    quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado 
    de acordo com a tabela a seguir:
    - Até 3 anos de empresa: aumento de 3%
    - entre 3 e 10 anos: aumento de 12.5%
    - 10 anos ou mais: aumento de 20%
*/    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o valor do seu salário atual: ");
        double sal = sc.nextDouble();
        System.out.print("Digite quantos anos trabalha na empresa: ");
        int anos = sc.nextInt();
        
        double nSal = 0;
        
        if (anos <= 3) {
            nSal = sal * 0.03;
        } else if (anos > 3 && anos < 9) {
            nSal = sal * 0.125;
        } else if (anos >= 10) {
            nSal = sal * 0.2;
        } 
        
        System.out.println("Olá "+nome+". Muito obrigado pelos seu tempo de contribuição a empresa.");
        System.out.println("Seu salário foi resjustado para:");
        System.out.printf("R$ %.2f%n", sal+nSal);
    }
}
