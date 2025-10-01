package Aula_12;

import java.util.Scanner;

public class F_Ex02 {

/*  2. Crie um método que receba um número inteiro e retorne true se o número 
    for par e false se for ímpar. Utilize este método em um programa que 
    verifique a paridade de um número fornecido pelo usuário.
*/
    
    //Metodo Par ou Impar
    public static boolean mPar(int n) {
        return n % 2 == 0;
    } 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número que deseja verificar: ");
        int n = sc.nextInt();
        
        System.out.println("O número "+n+" é Par? "+mPar(n));
    }
}
