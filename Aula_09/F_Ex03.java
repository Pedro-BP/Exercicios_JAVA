package Aula_09;

public class F_Ex03 {

/*  3. Encontrar o maior número em um array de inteiros
*/
    public static void main(String[] args) {
        
        int[] numeros = {0, 1, 2, 3, 4, 5};
        
        int maior = numeros[0];
        int menor = numeros[0];
        
        for (int num : numeros) {
            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }
        
        System.out.println("O maior é: "+maior);
        System.out.println("O menor é: "+menor);
    }
}
