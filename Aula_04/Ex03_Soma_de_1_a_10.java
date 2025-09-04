package Aula_04;

public class Ex03_Soma_de_1_a_10 {

/*  3. Calcular a soma dos números de 1 a 10.
*/
    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        
        System.out.println(soma);
    }
}
