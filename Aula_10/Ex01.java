package Aula_10;

import java.util.HashSet;

public class Ex01 {
    
/*  1. Hashset de números inteiros (1 a 10) e verificar se contém o número 5
*/
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<>();
 
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
      
        System.out.println("Conjunto de números: " + numeros);
        System.out.println("Contém o número 5? " + numeros.contains(5));
    }
}
