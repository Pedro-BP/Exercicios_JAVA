package Aula_09;

import java.util.Scanner;

public class F_Ex04 {

/*  4. Calcular e exibir a média de notas de um array de doubles
*/     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas notas você vai digitar? ");
        int qnt = sc.nextInt();
        
        double[] notas = new double[qnt];

        for (int i = 0; i < qnt; i++) {
            System.out.print((i+1)+". ");
            notas[i] = sc.nextDouble();
        }
        
        double soma = 0;
        
        for (double nota : notas) {
            soma += nota;
        }
        
        double med = soma / qnt;
        
        System.out.println("A média das "+qnt+" notas é: "+med);
    }
}
