package Aula_04;

import java.util.Scanner;

public class Ex05_Média_de_5_Números {

/*  5. Calcular a média de 5 números informados pelo usuário.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
       
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o "+i+"º número: ");
            double n = sc.nextDouble();
            soma += n;
        }
        double media = soma / 5;
        
        System.out.println("A média das 5 notas é: "+media);
    }
}
