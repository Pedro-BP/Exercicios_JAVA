package Exemplos;

import java.util.Scanner;

public class ExDoWhile { //Somador
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        String resp; 
        
        do {
            System.out.print("Digite um valor para ser somado: ");
            int num = sc.nextInt();
            soma += num;
            System.out.println("Você deseja continuar? s ou n");
            resp = sc.next().toLowerCase();
            
            while (!resp.equals("s") && !resp.equals("n")) {
                System.out.print("Resposta inválida. Digite apenas s ou n: ");
                resp = sc.next().toLowerCase();
            }
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é: "+soma);
    }
}
