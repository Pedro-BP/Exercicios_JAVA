package Exemplos;

import java.util.ArrayList;

public class Exemplo01_Arraylist {

    public static void main(String[] args) {
        
        //Criar uma arraylist de String
        ArrayList<String>listaDeNomes = new ArrayList<>();
        ArrayList<Integer>listaInt = new ArrayList<>();
        
        // Criando um array de inteiros
        int[] numeros = {10, 20, 30, 40, 50};
        
        //Adicionar alguns elementos nele
        listaDeNomes.add("Luis");
        listaDeNomes.add("Felipe");
        listaDeNomes.add("Ryan");
        
        //Puxar o nome de uma posição
        String primeiroNome = listaDeNomes.get(0);
        System.out.println(primeiroNome);
        
        //Remover um elemento
        listaDeNomes.remove("Felipe"); //Remover o NOME
        listaDeNomes.remove(1); //Remover o elemento da posição
        listaInt.removeIf(l -> l % 2 == 0); //Remove par
        listaInt.removeIf(l -> l % 2 == 1); //Remove impar
        
        //Verificar o tamanho da lista
        int tamanho = listaDeNomes.size();
        System.out.println(tamanho);
        
        //Verificar se a lista contem um elemento X
        boolean contemRyan = listaDeNomes.contains("Ryan");
            //Retorna True de "Ryan" estiver na lista
        System.out.println(contemRyan);
            
        //Limpar a lista
        listaDeNomes.clear();
        System.out.println("Todos os nomes foram removidos da lsita.");
        
        //Verificar se a lista está vazia
        boolean estaVazia = listaDeNomes.isEmpty();
        System.out.println("A lista está vazia? "+estaVazia);
        
        //Imprimir os elementos da lista
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }
    }
}
