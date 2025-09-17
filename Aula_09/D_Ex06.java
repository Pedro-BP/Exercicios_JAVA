package Aula_09;

public class D_Ex06 {
/*  6. Encontrar todos os números primos em um array de inteiros (desafio)
*/    
     public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 5, 6, 7, 11, 15, 18, 19, 23, 24};

        System.out.print("Primos: ");
        for (int n : numeros) {
            boolean primo = n > 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(n + " ");
            }
        }
    }
}
