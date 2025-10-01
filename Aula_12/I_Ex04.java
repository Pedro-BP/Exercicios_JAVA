package Aula_12;

public class I_Ex04 {

/*  4. Crie um método que receba dois números inteiros base e expoente e retorne
    o resultado de base elevado a expoente sem usar bibliotecas matemáticas como
    Math.pow.
*/    
    
    // Método base^expoente
    public static int mPotencia(int base, int expoente) {
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base; 
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("2^3 = "+mPotencia(2, 3)); 
        System.out.println("5^0 = "+mPotencia(5, 0));
        System.out.println("3^4 = "+mPotencia(3, 4)); 
    }
}