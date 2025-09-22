package Aula_10;

import java.util.HashSet;

public class Ex08 {

/*  8. Intere sobre um Hashset de animais
*/  
    public static void main(String[] args) {
        
        HashSet<String> animais = new HashSet<>();
        
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Leão");
        animais.add("Elefante");

        System.out.println("Animais no HashSet:");

        for (String animal : animais) {
            System.out.println(animal);
        }
    }
}
