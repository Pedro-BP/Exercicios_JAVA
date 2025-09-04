package Aula_04;

import java.util.Scanner;

public class Ex09_Maior_e_Menor_Número {

/*  9. Solicitar ao usuário 7 números e identificar o maior e o menor valor 
    digitados.
*/  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o 1º número: ");
        int n0 = sc.nextInt();
        
        int maN = n0;
        int meN = n0;
        
        for (int i = 2; i <= 7; i++) {
            System.out.print("Digite o "+i+"º número: ");
            int n = sc.nextInt();
            
            if (n > maN) {
                maN = n;
            } else if (n < meN) {
                meN = n;
            }
        }
        
        System.out.println("Entre os números que digitou:");
        System.out.println("Esse é o maior: "+maN);
        System.out.println("Esse é o menor: "+meN);
    }
}
