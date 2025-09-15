package Aula_08;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02_Acessar_Elementos_por_Índice {

/*  2. Acessar Elementos por Índice:
    Crie um ArrayList de doubles, adicione cinco números decimais, acesse e 
    imprima o terceiro elemento da lista.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Double>listaDouble = new ArrayList<>();
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número: ");
            double n = sc.nextDouble();
            listaDouble.add(n);
        }
        System.out.println(listaDouble.get(2));
    }
}
