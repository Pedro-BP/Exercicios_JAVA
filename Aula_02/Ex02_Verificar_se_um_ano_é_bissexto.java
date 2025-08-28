package Aula_02;

import java.util.Scanner;

public class Ex02_Verificar_se_um_ano_é_bissexto {

/*  Exercício 2 – Verificar se um ano é bissexto
    Utiliza boolean para aplicar a regra de ano bissexto.
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        System.out.println("O ano " + ano + " é bissexto? " + bissexto);
    }
}
