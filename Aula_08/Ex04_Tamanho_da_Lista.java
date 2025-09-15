package Aula_08;

import java.util.ArrayList;

public class Ex04_Tamanho_da_Lista {

/*  4. Tamanho da Lista:
    Crie um ArrayList de caracteres, adicione quatro letras e imprima o 
    tamanho da lista.
*/
    public static void main(String[] args) {
        
        ArrayList<Character>listaLetras = new ArrayList<>();
        
        listaLetras.add('A');
        listaLetras.add('B');
        listaLetras.add('C');
        listaLetras.add('D');
        
        System.out.println("Qual o tamanho da lista? A lista tem "+listaLetras.size()+" letras.");
    }
}
