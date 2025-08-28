package Exemplos;

public class Operadores_Relacionais {

    // > | < | >= | <= | == | !=
    public static void main(String[] args) {
    
        int a=2, b=3, c=5;

/*      System.out.println("A é MAIOR que B? "+(a>b));
        System.out.println("A é IGUAL a B? "+ (a==b));
        System.out.println("A é DIFERENTE de B? "+(a!=b));
        System.out.println("C é MAIOR IGUAL a 5? "+(c>=5));
        System.out.println("C é MAIOR que 5? "+(c>5));
        System.out.println("C é IGUAL a A + B? "+(c==a+b));
        System.out.println("C é MAIOR IGUAL a Bª? "+(c>=Math.pow(b, a)));
        System.out.println("C é IMPAR? "+(c%2==1));
*/
        //Exemplo de E (&&)
        System.out.println((a==b)&&(c>a));
        
        //Exemplo de OU (||)
        System.out.println((a==b)||(c>a));
        
        //Exemplo de NÃO (!) 
        System.out.println(!((a==b)||(c>a)));
        
        
    }
}
