package Aula_01;

import java.util.Scanner;

public class Ex08_Desconto_no_Produto {

    /*8. Desconto no Produto: Uma loja está oferecendo 5% de desconto em todos 
    os seus produtos. Crie um programa que pergunte o valor de um produto e 
    calcule o novo valor com o desconto aplicado. Exiba o resultado formatado 
    com duas casas decimais.*/
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do seu produto: ");
        double valor = teclado.nextDouble();

        double desconto = 0.05 * valor;

        System.out.printf("Produto com desconto aplicado: R$ %.2f%n", (valor - desconto));
    }
}
