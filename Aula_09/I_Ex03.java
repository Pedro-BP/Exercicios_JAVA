package Aula_09;

import java.util.ArrayList;

public class I_Ex03 {

/*  3. Trocar todos os valores ímpares por zero em um array de inteiros
*/
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("A lsita inicial é assim:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Agora a lista com 0 no lugar dos impares:");

        for (int numero : numeros) {
            if (numero % 2 == 1) {
                numero = 0;
            }
            System.out.println(numero);
        }
    }
}
