package Aula_01_pt_2;

import java.util.Scanner;

public class Ex07_Idade_em_dias {
    
    /*7) Idade em dias: Leia sua idade em anos e mostre a idade aproximada em 
    dias (365 dias/ano).*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite quantos anos você tem: ");
        int anos = teclado.nextInt();
        
        System.out.println("Sua idade aproximada em dias é: "+(anos*365));
    }
}
