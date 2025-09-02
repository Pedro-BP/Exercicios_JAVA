package Aula_03_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex10_Verificador_de_Email {

/*  10. Verificador de E-mail: Crie um programa que leia um e-mail e verifique 
    se ele contém "@" e termina com ".com". 
    DICA:  if (email.contains("@") && email.endsWith(".com")) {
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Crie um E-mail: ");
        String email = sc.nextLine();
        
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("E-mail válido.");
        } else {
            System.out.println("E-mail inválido.");
        }
    }
}
