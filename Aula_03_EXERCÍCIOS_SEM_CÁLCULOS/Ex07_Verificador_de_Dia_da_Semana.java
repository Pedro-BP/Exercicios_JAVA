package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex07_Verificador_de_Dia_da_Semana {

/*  7. Verificador de Dia da Semana
    Enunciado: Faça um programa que leia um dia da semana (ex.: "segunda") e 
    informe se é um dia útil ou de fim de semana.
    DICA: "if (dia.equals("segunda") ||"
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um dia da semana: ");
        String dia = sc.nextLine().toLowerCase();
        
        if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println("Dia útil.");
        } else if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("Não é um dia útil.");
        }
    }
}
