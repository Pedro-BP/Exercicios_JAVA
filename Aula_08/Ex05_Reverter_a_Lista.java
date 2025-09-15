package Aula_08;

import java.util.ArrayList;

public class Ex05_Reverter_a_Lista {

/*  5. Reverter a Lista:
    Crie um ArrayList de strings, adicione seis palavras, inverta a ordem dos 
    elementos na lista sem usar bibliotecas auxiliares e imprima a lista 
    revertida.
*/
    public static void main(String[] args) {
        
        ArrayList<String>listaPalavras = new ArrayList<>();
        
        listaPalavras.add("Pedro");
        listaPalavras.add("Gasosa");
        listaPalavras.add("Muito");
        listaPalavras.add("É");
        listaPalavras.add("Irmã");
        listaPalavras.add("Sua");

        for (int i = 5; i >= 0; i--) {
            System.out.println(listaPalavras.get(i));
        }
    }
}
