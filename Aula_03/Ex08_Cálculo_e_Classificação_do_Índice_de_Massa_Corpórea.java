package Aula_03;

import java.util.Scanner;

public class Ex08_Cálculo_e_Classificação_do_Índice_de_Massa_Corpórea {

/*  8. O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura 
    e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar 
    o indivíduo dentro de certas faixas.
    -   abaixo de 18.5: Abaixo do peso
    -   entre 18.5 e 25: Peso ideal
    -   entre 25 e 30: Sobrepeso
    -   entre 30 e 40: Obesidade
    -   acima de 40: Obseidade mórbida  
    Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo 
    quadrado da altura)
*/
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Classificação: Obesidade");
        } else {
            System.out.println("Classificação: Obesidade mórbida");
        }

        sc.close();
    }
}
