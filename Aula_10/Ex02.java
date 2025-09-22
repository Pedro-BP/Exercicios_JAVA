package Aula_10;

import java.util.HashSet;

public class Ex02 {

/*  2. Hashset de string com frutas e remoção
*/
    public static void main(String[] args) {
        
        HashSet<String> frutas = new HashSet<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");

        frutas.remove("Banana");

        System.out.println("Conjunto de frutas (sem Banana): " + frutas);
    }
}
