package Aula_04;

import java.util.Scanner;

public class Ex07_Contagem_com_Incremento {

/*  7. Solicitar ao usuário um número inicial, um número final e um incremento, 
    e exibir a contagem entre esses números com o incremento especificado.
*/  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inicial: ");
        int a = sc.nextInt();
        System.out.print("Digite um número final: ");
        int b = sc.nextInt();
        System.out.print("Digite um incremento: ");
        int c = sc.nextInt();
        
        if(c == 0) {
            System.out.println("O incremento não pode ser 0.");
        } else if (a > b) {
            for (int i = a; i >= b; i-=c) {
                System.out.println(i);
            }
        } else if (a < b) {
            for (int i = a; i <= b; i+=c) {
                System.out.println(i);
            }
        } else {
            System.out.println("Os números são iguais.");
        }
    } 
}
