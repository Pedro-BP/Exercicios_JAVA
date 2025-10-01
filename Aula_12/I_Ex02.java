package Aula_12;

import java.util.Arrays;

public class I_Ex02 {

/*  2. Crie um método que receba um array de inteiros e o retorne ordenado em 
    ordem crescente.
*/    
    
    // Método crescente
    public static int[] mCrescente(int[] numeros) {
        Arrays.sort(numeros); //Código para ordenar Array em ordem crescente
        return numeros;       
    }

    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 7, 3};

        System.out.println("Array original: "+Arrays.toString(numeros));

        int[] ordenado = mCrescente(numeros);

        System.out.println("Array ordenado: "+Arrays.toString(ordenado));
    }
}