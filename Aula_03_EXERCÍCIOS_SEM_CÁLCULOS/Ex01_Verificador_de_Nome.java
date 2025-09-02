package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex01_Verificador_de_Nome {

/*  1. Verificador de Nome: Faça um programa que leia o nome de uma pessoa e 
    verifique se ele contém mais de 5 caracteres. Mostre uma mensagem 
    apropriada. DICA: "if (nome.length() > 5)"
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
        
        if (nome.length() > 5) {
            System.out.println("Seu nome tem mais de 5 letras.");
        } else {
            System.out.println("Seu nome tem menos de 5 letras ou tem 5 letras.");
        }
    }
}
