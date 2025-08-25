package Aula_01;

import java.util.Scanner;

public class Ex11_Multa_por_Excesso_de_Velocidade {

    /*11. Multa por Excesso de Velocidade: Em uma rodovia, a velocidade máxima 
    permitida é de 80 km/h. Crie um programa que pergunte a velocidade de um 
    carro e calcule a multa, caso o motorista tenha excedido o limite. A multa 
    é de R$ 5 por cada km/h acima do limite. Exiba uma mensagem informando se 
    o motorista foi multado e, em caso afirmativo, qual o valor da multa.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite a velocidade do carro: ");
        double vel = teclado.nextDouble();
        
        if (vel > 80) {
            double multa = (vel - 80) * 5;
            
            System.out.printf("A sua multa é de R$ %.2f%n", multa);
        } else {
            System.out.println("Você não levou multa!");
        }
    }
}
