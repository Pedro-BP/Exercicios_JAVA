package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex05_Classificador_de_Login {

/*  5. Classificador de Login: Faça um programa que leia um login e informe se 
    ele é "válido" (contém pelo menos 6 caracteres e não tem espaços) ou 
    "inválido". DICA: "if (login.length() >= 6 && !login.contains(" ")) {"
*/     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Login: ");
        String login = sc.nextLine();
        
        if (login.length() >= 6 && !login.contains(" ")) {
            System.out.println("válido");
        } else {
            System.out.println("inválido");
        }
    }
}
