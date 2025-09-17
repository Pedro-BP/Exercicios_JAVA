package Aula_09;

import java.util.ArrayList;
import java.util.Arrays;

public class A_Ex02 {

/*  2. Filtrar strings que contém a letra 'a' em um ArrayList e exibi-las  
*/    
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Ana", "Pedro", "Maria", "João"));

        for (String nome : nomes) {
            if (nome.toLowerCase().contains("a")) {
                System.out.println(nome);
            }
        }
    }
}
