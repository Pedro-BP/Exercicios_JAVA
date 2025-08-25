package Aula_01;

import java.util.Scanner;

public class Ex04_Conversor_de_Medidas {

    /*4. Conversor de Medidas: Crie um programa que leia uma distância em metros
    e exiba essa distância convertida em quilômetros e centímetros.*/
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a distância em metros: ");
        double m = teclado.nextDouble();
        System.out.println("");
        System.out.println("Esse valor também pode ser representado como:");
        System.out.println((m/1000)+" Km");
        System.out.println((m*100)+" cm");
    }
}
