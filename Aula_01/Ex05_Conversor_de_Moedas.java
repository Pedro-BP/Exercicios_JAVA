package Aula_01;

import java.util.Scanner;

public class Ex05_Conversor_de_Moedas {

    /*5. Conversor de Moedas: Imagine que você está indo viajar para os Estados 
    Unidos e precisa converter seus reais em dólares. Crie um programa que 
    pergunte quantos reais você tem na carteira e mostre quantos dólares você 
    poderá comprar, considerando a cotação do dólar a R$ 5,45. Formate a saída 
    para mostrar o valor em dólares com duas casas decimais.*/
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor em Reais para a conversão: ");
        double vReal = teclado.nextDouble();
        System.out.println("");
        System.out.printf("U$ %.2f%n",(vReal/5.45));
    }
}
