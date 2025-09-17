package Aula_09;

public class F_Ex02 {

/*  2. Exibir elementos de uma lista de strings em letras maiúsculas
*/
    public static void main(String[] args) {
        
        String[] letras = {"a", "b", "c", "d"};
        
        for (String mai : letras) {
            System.out.println(mai.toUpperCase());
        }
    }
}
