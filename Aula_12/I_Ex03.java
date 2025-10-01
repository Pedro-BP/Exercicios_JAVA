package Aula_12;

import java.util.Arrays;

public class I_Ex03 {

/*  3. Crie um método que receba um array de números inteiros e retorne a média 
    aritmética desses números.
*/    
    
    // Método média aritmética
    public static double mMedia(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num; 
        }

        return (double) soma / numeros.length; 
    }

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20};

        System.out.println("Array: "+Arrays.toString(numeros));
        double media = mMedia(numeros);
        System.out.println("Média aritmética: "+media);
    }
}