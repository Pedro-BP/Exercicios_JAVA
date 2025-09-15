package Aula_08;

import java.util.ArrayList;

public class Ex01_Adicionar_e_Imprimir_Elementos {

/*  1. Adicionar e Imprimir Elementos:
    Crie um ArrayList de strings, adicione cinco nomes de cidades, imprima 
    todas as cidades na lista.
*/
    public static void main(String[] args) {
        
        ArrayList<String>listaCidades = new ArrayList<>();
        
        listaCidades.add("Imbé");
        listaCidades.add("Tramandaí");
        listaCidades.add("Cidreira");
        listaCidades.add("São Leopoldo");
        listaCidades.add("Porto Alegre");
        
        for (String nome : listaCidades) {
            System.out.println(nome);
        }
    }
}
