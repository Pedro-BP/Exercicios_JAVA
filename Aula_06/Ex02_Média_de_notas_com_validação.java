package Aula_06;

import java.util.Scanner;

public class Ex02_Média_de_notas_com_validação {

/*  Exercício 2: Média de notas com validação
    Criar um algoritmo que leia 4 notas de um aluno, validando se as notas 
    estão entre 0 e 10. Calcular e exibir a média das notas.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota = 0, soma = 0, med = 0;
        int cont = 1; 
        
            do {
                System.out.print("Digite a "+cont+"º nota: ");
                nota = sc.nextDouble();

                if (nota >= 0 && nota < 10) {
                    soma += nota;
                    cont += 1;
                }
            } while (cont != 5);
        
        med = soma / 4;
        
        System.out.println("A média do aluno é: "+med);
    }
}
