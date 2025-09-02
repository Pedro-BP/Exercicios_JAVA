package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex06_Comparador_de_Palavras {

/*  6. Comparador de Palavras: Crie um programa que leia duas palavras e 
    informe se elas são iguais (ignorando maiúsculas/minúsculas).
    DICA: " if (palavra1.equalsIgnoreCase(palavra2)) {"
*/  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String p1 = sc.nextLine().toLowerCase();
        System.out.print("Digite outra palavra: ");
        String p2 = sc.nextLine().toLowerCase();
        
        if (p1.equalsIgnoreCase(p2)) {
            System.out.println("As palavras são iguais.");
        } else {
            System.out.println("As palavras não são iguais.");
        }
    }
}
