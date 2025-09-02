package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex04_Verificador_de_Vogais {

/*  4. Verificador de Vogais: Crie um programa que leia uma palavra e informe 
    se ela contém pelo menos uma vogal (a, e, i, o, u). 
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase(); 

        if (palavra.matches(".*[aeiouáàâãéèêíìîóòôõúùûü].*")) {
            System.out.println("A palavra contém pelo menos uma vogal.");
        } else {
            System.out.println("A palavra não contém vogais.");
        }
    }
}
