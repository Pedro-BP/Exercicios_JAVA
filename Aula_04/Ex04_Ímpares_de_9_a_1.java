package Aula_04;

public class Ex04_Ímpares_de_9_a_1 {

/*  4. Exibir os números ímpares de 9 a 1 em ordem decrescente.
*/
    public static void main(String[] args) {
        
        for (int i = 9; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
