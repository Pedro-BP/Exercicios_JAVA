package Aula_01;

import java.util.Scanner;

public class Ex06_Pintando_a_Parede {

    /*6. Pintando a Parede: Sua mãe decidiu pintar uma parede do seu quarto e 
    precisa calcular a quantidade de tinta necessária. Sabendo que cada litro 
    de tinta pinta 2 metros quadrados, crie um programa que pergunte a altura 
    e largura da parede, calcule a área e exiba quantos litros de tinta serão 
    necessários.*/
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a altura da parede: ");
        double altura = teclado.nextDouble();
        System.out.print("Digite a largura da parede: ");
        double largura = teclado.nextDouble();

        double mQuad = altura * largura;

        System.out.println("Para uma parede de " + mQuad + "m² serão nescessários " + (mQuad / 2) + " litros de tinta.");
    }
}
