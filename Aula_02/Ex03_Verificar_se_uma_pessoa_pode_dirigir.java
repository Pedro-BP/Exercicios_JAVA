package Aula_02;

import java.util.Scanner;

public class Ex03_Verificar_se_uma_pessoa_pode_dirigir {

/*  Exercício 3 – Verificar se uma pessoa pode dirigir
    A pessoa deve ter 18 anos ou mais e possuir carteira de motorista (CNH).
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua idade (em anos): ");
        int idade = sc.nextInt();
        System.out.println("você possui CNH? ");
        System.out.println("[1] SIM");
        System.out.println("[2] NÃO");
        int sccnh = sc.nextInt();
        
        boolean cnh = true;
        
        if (sccnh == 2) {
            cnh = false;
        }
        
        
        boolean pd = (idade >= 18) && (cnh == true);
        
        System.out.println("Você pode dirigir? "+pd);
    }
}
