package Aula_12;

import java.util.Arrays;

public class I_Ex05 {

/*  5. Crie um método que receba um array de inteiros e retorne o maior valor 
    presente nesse array.
*/
    
    // Método maior valor
    public static int mMaior(int[] numeros) {
        int maior = numeros[0];

        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 12, 3, 27, 9};

        System.out.println("Array: "+Arrays.toString(numeros));
        int maior = mMaior(numeros);
        System.out.println("Maior valor: "+maior);
    }
}