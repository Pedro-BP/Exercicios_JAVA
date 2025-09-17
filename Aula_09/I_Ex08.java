package Aula_09;

public class I_Ex08 {

/*  8. Contar quantos elementos de um array de inteiros são pares    
*/
    public static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int cont = 0;
        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                cont ++;
            }
        }
        
        System.out.println("Quantos números da lista são pares? "+cont);
    }
}
