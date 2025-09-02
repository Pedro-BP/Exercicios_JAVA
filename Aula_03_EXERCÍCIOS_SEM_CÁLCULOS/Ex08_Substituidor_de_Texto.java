package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex08_Substituidor_de_Texto {

/*  8. Substituidor de Texto: Crie um programa que leia uma frase e substitua 
    todas as ocorrências da palavra "Java" por "Programação".
    DICA: "String novaFrase = frase.replace("Java", "Programação");"
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        
        String novaFrase = frase.replace("Java", "Programação");
        
        System.out.println(novaFrase);
    }
}
