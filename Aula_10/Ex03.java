package Aula_10;

import java.util.HashSet;

public class Ex03 {

/*  3. Hashset de números inteiros (1 a 5), limpar e verificar vazio
*/    
    public static void main(String[] args) {

        HashSet<Integer> numeros2 = new HashSet<>();

        for (int i = 1; i <= 5; i++) {
            numeros2.add(i);
        }

        System.out.println("Antes de limpar: " + numeros2);

        numeros2.clear();

        System.out.println("Depois de limpar: " + numeros2);
        System.out.println("Está vazio? " + numeros2.isEmpty());
    }
}
