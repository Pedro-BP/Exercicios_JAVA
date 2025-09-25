package Exemplos;

public class Matriz {

    public static void main(String[] args) {
        
        int [][] tabuada = new int[11][11];
        
        for (int linha = 1; linha < 11; linha++) {
            for (int coluna = 0; coluna < 11; coluna++) {
                tabuada[linha][coluna] = (linha)*(coluna);
            }
        }
        
        //Imprime a matriz formatada
        for (int linha = 1; linha < 11; linha++) {
            for (int coluna = 0; coluna < 11; coluna++) {
                System.out.println(linha+" x "+coluna+" = "+tabuada[linha][coluna]);
            }
        }
    }
}
