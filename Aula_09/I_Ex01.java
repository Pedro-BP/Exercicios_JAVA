package Aula_09;

public class I_Ex01 {

    /*  1. Contar quantos elementos de um array de inteiros são maiores que 10
     */
    public static void main(String[] args) {
        int[] numeros = {5, 11, 20, 3, 15, 8, 12};

        int cont = 0;

        for (int n : numeros) {
            if (n > 10) {
                cont += 1;
            }
        }
        
        System.out.println("Quantidade de elementos maiores que 10: "+cont);
    }
}
