package Aula_01_pt_2;

import java.util.Scanner;

public class Ex10_Salário_com_bônus {

    /*10) Salário com bônus: Leia o salário base e bônus em % e mostre o 
    salário final.*/
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o salário base: ");
        double sBase = teclado.nextDouble();
        System.out.print("Digite o bônus: ");
        double bonus = teclado.nextDouble();
        
        double sFinal = ((bonus/100)*sBase)+sBase;
        
        System.out.printf("Seu salário de R$ %.2f%n",sBase);
        System.out.println("Recebera uma atualização de "+bonus+"%");
        System.out.printf("Salário atualizado para R$ %.2f%n",sFinal);
    }
}
