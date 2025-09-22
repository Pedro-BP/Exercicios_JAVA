package Aula_10;

import java.util.HashSet;

public class Ex04 {

/*  4. Hashset de cidades, verificar se está vazio
*/
    public static void main(String[] args) {

        HashSet<String> cidades = new HashSet<>();

        cidades.add("Rio de Janeiro");
        cidades.add("São Paulo");
        cidades.add("Belo Horizonte");
        
        System.out.println("Conjunto de cidades: " + cidades);
        System.out.println("Está vazio? " + cidades.isEmpty());
    }
}
