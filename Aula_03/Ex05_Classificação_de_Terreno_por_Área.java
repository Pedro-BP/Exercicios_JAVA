package Aula_03;

import java.util.Scanner;

public class Ex05_Classificação_de_Terreno_por_Área {

/*  5. Faça um programa que leia a largura e o comprimento de um terreno 
    retangular, calculando e mostrando a sua área em m². O programa também 
    devemostrar a classificação desse terreno, de acordo com a lista abaixo:
    - Abaixo de 100m² = TERRENO POPULAR
    - Entre 100m² e 500m² = TERRENO MASTER
    - Acima de 500m² = TERRENO VIP
*/ 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a largura do terreno: ");
        double largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        double comprimento = sc.nextDouble();
        
        double area = largura * comprimento;
        
        System.out.println("Área: "+area+"m²");
        
        if (area < 100) {
            System.out.println("TERRENO POPULAR");
        } else if (area >= 100 && area <= 500) {
            System.out.println("TERRENO MASTER");
        } else if (area > 500) {
            System.out.println("TERRENO VIP");
        }
    }
}
