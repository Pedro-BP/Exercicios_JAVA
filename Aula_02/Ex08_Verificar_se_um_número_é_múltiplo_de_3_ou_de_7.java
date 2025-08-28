package Aula_02;

import java.util.Scanner;

public class Ex08_Verificar_se_um_número_é_múltiplo_de_3_ou_de_7 {

/*  Exercício 8 – Verificar se um número é múltiplo de 3 ou de 7
    Utiliza o operador módulo junto com operadores lógicos para determinar a 
    condição.
*/
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um núemro: ");
        int n = sc.nextInt();
        
        boolean div = n%3==0 || n%7==0;
        
        System.out.println(n+" é divisivel por 3 ou 7? "+div);
    }
}
