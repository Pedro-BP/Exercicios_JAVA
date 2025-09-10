package Aula_06;

public class Ex03_Contagem_regressiva_com_pausa {

/*  Exercício 3*: Contagem regressiva com pausa
    Criar um algoritmo que faça uma contagem regressiva de 10 a 1, com um 
    intervalo de 1 segundo entre cada número.
*/
    public static void main(String[] args) throws InterruptedException {
        
        int cont = 10;
        
        do {
            System.out.println(cont);
            Thread.sleep(1000);
            cont --;
        } while (cont >= 1);
    }
}
