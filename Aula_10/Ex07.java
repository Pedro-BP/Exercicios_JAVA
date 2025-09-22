package Aula_10;

import java.util.HashSet;

public class Ex07 {

/*  7. Exibir tamanho do Hashset de caracteres (alfabeto)
*/
    public static void main(String[] args) {
        
        HashSet<Character> alfabeto = new HashSet<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            alfabeto.add(c);
        }

        System.out.println("Tamanho do alfabeto no HashSet: " + alfabeto.size());
    }
}
