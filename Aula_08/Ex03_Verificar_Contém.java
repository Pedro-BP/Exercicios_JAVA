package Aula_08;

import java.util.ArrayList;

public class Ex03_Verificar_Contém {

/*  3. Verificar Contém:
    Crie um ArrayList de strings, adicione três cores ("Vermelho", "Verde", 
    "Azul"), verifique se a cor "Amarelo" está na lista e imprima o resultado.
*/  
    public static void main(String[] args) {
    
        ArrayList<String>listaCores = new ArrayList<>();    
        
        listaCores.add("Vermelho");
        listaCores.add("Verde");
        listaCores.add("Azul");
        
        System.out.println("A cor Amarela está na lista? "+listaCores.contains("Amarelo"));
    }
}
