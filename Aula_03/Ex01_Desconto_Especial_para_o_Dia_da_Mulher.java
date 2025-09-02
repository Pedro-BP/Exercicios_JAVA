package Aula_03;

import java.util.Scanner;

public class Ex01_Desconto_Especial_para_o_Dia_da_Mulher {

/*  1. Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar 
    descontos para todos, mas especialmente para mulheres. Faça um programa 
    que leia nome, sexo e o valor das compras do cliente e calcule o preço com 
    desconto. Sabendo que:
    - Homens ganham 5% de desconto
    - Mulheres ganham 13% de desconto
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor, para uma melhor expêriencia de atendimento informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Olá "+nome+", seja bem vindo ao auto atendimento da LOJAXK!");
        System.out.println("Estamos com uma promoção do dia da mulher, gostaria de nos informar o seu gênero?");
        System.out.println("[1] Masculino");
        System.out.println("[2] Feminino");
        System.out.print("Escolha: ");
        int sexo = sc.nextInt();
        System.out.print("Quantos produtos você comprou? ");
        int qnt = sc.nextInt();
        
        int soma = 0;
        
        for (int i = 1; i < (qnt+1); i++) {
            System.out.print("Digite o valor da "+i+" compra: ");
            int valor = sc.nextInt();
            
            soma = soma + valor;
        }
            
        double desc = 0;
        
        if (sexo == 1) {
            desc = soma * 0.05;
        } else if (sexo == 2) {
            desc = soma * 0.13;
        }
        
        double preco = soma - desc;
        
        System.out.println(nome+" o valor do seu produto com o desconto aplicado:");
        System.out.printf("R$ %.2f%n",preco);
    }   
}
