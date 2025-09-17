package Aula_09;

import java.util.ArrayList;

public class I_Ex02 {

/*  2. Contar quantos nomes em um ArrayList começam com a letra 'A'
*/
    public static void main(String[] args) {
        
    ArrayList<String>nomes = new ArrayList<>();
    
    nomes.add("Maria");
    nomes.add("José");
    nomes.add("Ana");
    nomes.add("João");
    nomes.add("Antônio");
    nomes.add("Francisco");
    nomes.add("Carlos");
    nomes.add("Paulo");
    nomes.add("Pedro");
    nomes.add("Lucas");
    
    int cont = 0;
    
    for (String nome : nomes) {
        if (nome.startsWith("A")) {
            cont ++;
        }
    }
    
        System.out.println("Quantidade de nomes que começam com A: " + cont);
    }
}
