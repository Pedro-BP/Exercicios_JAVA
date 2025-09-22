package Aula_10;

import java.util.ArrayList;
import java.util.HashSet;

public class Ex05 {

/*  5. Hashset de cores, converter para lista
*/    
    public static void main(String[] args) {
        
        HashSet<String> cores = new HashSet<>();

        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Amarelo");

        ArrayList<String> listaCores = new ArrayList<>(cores);

        System.out.println("Lista de cores: " + listaCores);
    }
}
