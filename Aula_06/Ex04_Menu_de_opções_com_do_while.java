package Aula_06;

import java.util.Scanner;

public class Ex04_Menu_de_opções_com_do_while {

/*  Exercício 4*: Menu de opções com do-while
    Criar um menu de opções com as seguintes escolhas: 1- Cadastrar, 
    2- Consultar, 3- Sair. O programa deve repetir a exibição do menu e a 
    leitura da opção até que o usuário escolha a opção 3 (Sair).
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opc = 0;
        String nome = " ", consulta = " ";
        
        do {
            System.out.println("+---------------------+");
            System.out.println("| Selecione uma opção |");
            System.out.println("+---------------------+");
            System.out.println("| [1] Cadastrar       |");
            System.out.println("| [2] Consultar       |");
            System.out.println("| [3] Sair            |");
            System.out.println("+---------------------+");
            opc = sc.nextInt();

            if (opc == 1) {
                System.out.println("+---------------------+");
                System.out.println("|      Cadastro       |");
                System.out.println("+---------------------+");
                System.out.print ("Nome: ");
                nome = sc.next();
            } else if (opc == 2) {
                System.out.println("+---------------------+");
                System.out.println("|      Consulta       |");
                System.out.println("+---------------------+");
                System.out.print("Consultar: ");
                consulta = sc.next();
              
                if (consulta.equals(nome)) {
                    System.out.println("Cadastro Existente!");
                } else {
                    System.out.println("Cadastro Inexistente!");
                }
            }
        } while (opc != 3);
    }
}
