package Aula_12;

import java.util.Scanner;

public class F_Ex03 {

/*  3. Crie um método que receba um número inteiro positivo e retorne o fatorial
    desse número. O fatorial de um número n é o produto de todos os números
    inteiros positivos menores ou iguais a n.
*/
    
    //Metodo Fatorial
    public static int mFatorial(int n) {
        int fat = n;
        for (int i = (n-1); i > 0; i--) {
            fat *= i;
        }
        return fat;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        
        System.out.println("O fatorial de "+n+" é: "+mFatorial(n));
    }
}
