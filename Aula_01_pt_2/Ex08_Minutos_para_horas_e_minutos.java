package Aula_01_pt_2;

import java.util.Scanner;

public class Ex08_Minutos_para_horas_e_minutos {

    /*8) Minutos → horas e minutos: Leia um total de minutos e mostre em horas 
    e minutos.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o total de minutos: ");
        int tMin = teclado.nextInt();

        int h = tMin / 60;
        int min = tMin % 60;

        System.out.println(h + " horas e " + min + " minutos");
    }
}
