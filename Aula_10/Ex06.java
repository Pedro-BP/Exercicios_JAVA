package Aula_10;

import java.util.HashSet;

public class Ex06 {

/*  6. Remover "São Paulo" de um Hashset de cidades
*/
    public static void main(String[] args) {
        
        HashSet<String> cidades2 = new HashSet<>();
        
        cidades2.add("São Paulo");
        cidades2.add("Curitiba");
        cidades2.add("Porto Alegre");
        cidades2.add("Recife");
        
        cidades2.remove("São Paulo");
        
        System.out.println("Conjunto de cidades (sem São Paulo): " + cidades2);
    }
}
