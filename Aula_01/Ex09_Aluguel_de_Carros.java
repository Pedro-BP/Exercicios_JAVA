package Aula_01;

import java.util.Scanner;

public class Ex09_Aluguel_de_Carros {
 
    /*9. Aluguel de Carros: Uma locadora de carros cobra R$ 90 por dia de 
    aluguel e R$ 0,20 por quilômetro rodado. Crie um programa que pergunte 
    quantos quilômetros foram percorridos e por quantos dias o carro foi 
    alugado. Calcule o preço total do aluguel e exiba o resultado na tela.*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite quantos Km foram rodados: ");
        double km = teclado.nextDouble();
        System.out.print("Digite por quantos dias você ficou com o carro: ");
        double dias = teclado.nextDouble();
        
        double tAluguel = (dias * 90) + (km * 0.2);
        
        System.out.printf("O valor a pagar é: R$ %.2f%n", tAluguel);
    }
}
