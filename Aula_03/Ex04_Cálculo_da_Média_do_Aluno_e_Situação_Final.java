package Aula_03;

import java.util.Scanner;

public class Ex04_Cálculo_da_Média_do_Aluno_e_Situação_Final {

/*  4. Crie um programa que leia duas notas de um aluno e calcule a sua média, 
    mostrando uma mensagem no final, de acordo com a média atingida:
    - Média até 4.9: REPROVADO
    - Média entre 5.0 e 6.9: RECUPERAÇÃO
    - Média 7.0 ou superior: APROVADO
*/     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a 1º nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a 2º nota: ");
        double n2 = sc.nextDouble();
        
        double med = (n1+n2)/2;
        
        if (med < 5) {
            System.out.println("REPROVADO");
        } else if (med >= 5 && med < 7) {
            System.out.println("RECUPERAÇÃO");
        } else if (med >= 7) {
            System.out.println("APROVADO");
        }
        
        System.out.println("Nota final = "+med);
    }
}
