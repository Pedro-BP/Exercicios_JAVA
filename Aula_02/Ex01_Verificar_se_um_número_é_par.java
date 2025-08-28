package Aula_02;

import java.util.Scanner;

public class Ex01_Verificar_se_um_número_é_par {

/*  Exercício 1 – Verificar se um número é par
    Utiliza boolean para determinar se um número inteiro é par.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
       
        boolean par = n%2==0;
        
        System.out.println("O número "+n+" é par? "+par);
    }
}
