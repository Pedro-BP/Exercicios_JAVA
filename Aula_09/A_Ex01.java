package Aula_09;

import java.util.ArrayList;
import java.util.Arrays;

public class A_Ex01 {

/*  1. Filtrar números pares de um ArrayList de inteiros
*/    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        }
    }
}
