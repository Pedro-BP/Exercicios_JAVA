package Aula_02;

import java.util.Scanner;

public class Ex10_Verificar_se_um_valor_está_fora_do_intervalo {

/*  Exercício 10 – Verificar se um valor está fora do intervalo [100, 200]
    Utiliza operadores relacionais e lógicos para identificar se um número não 
    pertence ao intervalo.
*/    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um némero: ");
        int n = sc.nextInt();
        
        boolean inter = n < 100 || n > 200;
        
        System.out.println("O número está fora do intervalo [100, 200]? "+inter);
    }
}
