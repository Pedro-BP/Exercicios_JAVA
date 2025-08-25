package Aula_01;

import java.util.Scanner;

public class Ex12_Direito_ao_Voto {

    /*12. Direito ao Voto: Crie um programa que pergunte o ano de nascimento de 
    uma pessoa e determine se ela já tem idade para votar (16 anos ou mais). 
    Exiba uma mensagem informando se a pessoa tem direito ao voto.*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o ano em que nasceu: ");
        int ano = teclado.nextInt();
        
        if ((2025 - ano) >= 16) {
            System.out.println("Você tem direito ao voto!");
        } else {
            System.out.println("Você não tem direito ao voto!");
        }
    }
}
