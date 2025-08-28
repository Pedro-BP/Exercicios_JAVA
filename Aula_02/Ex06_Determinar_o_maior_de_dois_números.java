package Aula_02;

import java.util.Scanner;

public class Ex06_Determinar_o_maior_de_dois_números {

/*  Exercício 6 – Determinar o maior de dois números
    Utiliza operadores relacionais para comparar dois valores.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();
        
        if (n1 > n2){
            System.out.println("O maior número é: "+n1);
        }else if (n2 > n1){
            System.out.println("O maior número é: "+n2);
        }else{
            System.out.println("Os dois números são iguais.");
        }
    }
}
