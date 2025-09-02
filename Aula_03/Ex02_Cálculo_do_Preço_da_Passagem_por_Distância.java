package Aula_03;

import java.util.Scanner;

public class Ex02_Cálculo_do_Preço_da_Passagem_por_Distância {

/*  2. Faça um algoritmo que pergunte a distância que um passageiro deseja 
    percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para 
    viagens até 200Km e R$0.45 para viagens mais longas.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a distância da viagem em KM: ");
        double km = sc.nextDouble();
        
        double pass = 0;
        
        if (km > 200) {
            pass = km*0.45;
        } else {
            pass = km*0.50;
        }
        
        System.out.println("Preço da passagem:");
        System.out.printf("R$ %.2f%n",pass);
    }
}
