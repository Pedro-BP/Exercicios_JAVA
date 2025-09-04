package Aula_04;

import java.util.Scanner;

public class Ex08_Média_de_Idades {

/*  8. Solicitar ao usuário a idade de 5 pessoas e calcular a média das idades.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da "+i+"º pessoa: ");
            int idade = sc.nextInt();
            soma += idade;
        }
        
        double med = soma / 5;
        
        System.out.println("A média das 5 idades é: "+med);
        
    }
}
