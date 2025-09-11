package Aula_07_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex03_Sistema_de_Suporte_Técnico {

/*  Exercício 3: Sistema de Suporte Técnico
    Monte um programa que apresente ao usuário um menu com os seguintes 
    problemas comuns:
    1 - Problema de internet
    2 - Problema de login
    3 - Erro no sistema
    4 - Solicitação de atualização
    Cada opção deve exibir uma mensagem de orientação ao usuário, como se fosse 
    um chatbot de suporte.
    Se a opção for inválida, exiba “Opção não reconhecida, tente novamente.”
*/
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 - Problema de internet");
        System.out.println("2 - Problema de login");
        System.out.println("3 - Erro no sistema");
        System.out.println("4 - Solicitação de atualização");
        System.out.print("Escolha qual o seu problema: ");
        int opc = sc.nextInt();
        
        String msg = " ";
        
        switch (opc) {
            case 1:
                msg = "Entendi! Vamos verificar sua conexão. Primeiro, confirme \n"
                        + "se o cabo está conectado corretamente ou se o Wi-Fi está \n"
                        + "ativo. Caso o problema continue, tente reiniciar o modem. \n"
                        + "Deseja que eu abra um chamado técnico?"; break;
            case 2:
                msg = "Você está com dificuldade para acessar sua conta. \n"
                        + "Verifique se o usuário e a senha estão corretos. \n"
                        + "Se esqueceu a senha, utilize a opção 'Esqueci minha senha' \n"
                        + "para redefini-la. Precisa que eu envie o link de recuperação?"; break;
            case 3:
                msg = "Sentimos muito pelo transtorno! Por favor, informe o \n"
                        + "código ou a mensagem de erro exibida para que possamos \n"
                        + "identificar a causa. Enquanto isso, recomendamos reiniciar \n"
                        + "o sistema e tentar novamente."; break;
            case 4: 
                msg = "Certo! Para manter o sistema atualizado, vá até as \n"
                        + "configurações e clique em 'Verificar atualizações'. \n"
                        + "Caso já exista uma nova versão disponível, a instalação \n"
                        + "começará automaticamente. Deseja que eu envie o passo a \n"
                        + "passo completo?"; break;
            default: 
                msg = "Opção não reconhecida, tente novamente."; break;
        }
        System.out.println(msg);
    }
}
