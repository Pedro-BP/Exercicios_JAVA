package Aula_04;

import java.util.Scanner;

public class Ex06_Repetição_de_Caractere {

/*  6. Solicitar ao usuário um caractere e um número, e exibir o caractere 
    repetido o número de vezes especificado.
*/ 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um caractere: ");
        String car = sc.nextLine();
        System.out.print("Digite quantas vezes quer repetir o caractere: ");
        int v = sc.nextInt();
        
        for (int i = 1; i <= v; i++) {
            System.out.print(car);
        }
    }
}
