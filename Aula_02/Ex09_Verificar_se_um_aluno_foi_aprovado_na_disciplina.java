package Aula_02;

import java.util.Scanner;

public class Ex09_Verificar_se_um_aluno_foi_aprovado_na_disciplina {
    
/*  Exercício 9 – Verificar se um aluno foi aprovado na disciplina
    Critérios: nota maior ou igual a 60 e frequência maior ou igual a 75%.
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        System.out.print("Digite a porcentagvem de frequência do aluno: ");
        double freq = sc.nextDouble();
        
        boolean aprovado = nota >= 60 && freq >= 75;
        
        System.out.println("O aluno aprovado: "+aprovado);
    }
}
