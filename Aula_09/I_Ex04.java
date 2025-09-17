package Aula_09;

public class I_Ex04 {

/*  4. Contar quantos elementos de um array de inteiros são maiores que 10
*/
    public static void main(String[] args) {
        
        int[] numeros = {10,20,30,40,50};
        int cont = 0;
        
        for (int numero : numeros) {
            if (numero > 10) {
                cont++;
            }
        }
        
        System.out.println("Quantos números são maiores que 10? "+cont);
    }
}
