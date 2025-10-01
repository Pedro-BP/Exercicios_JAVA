package Aula_12;

import java.util.Scanner;

public class F_Ex05 {

/*  5. Crie um método que receba uma string e retorne o número de vogais 
    presentes nessa string.
*/
    
    //Metodo Contador de Vogais
    public static int mVogais(String palavra) {
        String vogais = "aeiouáàâãéèêíìîóòôõúùûü";
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (vogais.indexOf(letra) != -1) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        System.out.println("A palavra que digitou possui "+mVogais(palavra)+" vogais.");
    }
}
