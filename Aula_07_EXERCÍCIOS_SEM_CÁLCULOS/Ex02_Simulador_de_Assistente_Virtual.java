package Aula_07_EXERCÍCIOS_SEM_CÁLCULOS;

import java.util.Scanner;

public class Ex02_Simulador_de_Assistente_Virtual {

/*  Exercício 2: Simulador de Assistente Virtual
    Crie um programa que apresente ao usuário um menu de opções:
    1 - Ver previsão do tempo
    2 - Ver notícias
    3 - Abrir agenda
    4 - Ouvir música
    Cada opção deve exibir uma mensagem simulando a resposta de um assistente 
    virtual.
    Use switch-case para controlar o fluxo.
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Ver previsão do tempo");
        System.out.println("2 - Ver notícias");
        System.out.println("3 - Abrir agenda");
        System.out.println("4 - Ouvir música");
        int opc = sc.nextInt();

        String msg = " ";

        switch (opc) {
            case 1:
                msg = "Hoje o tempo está ensolarado, com máxima de 28 °C e mínima de 18 °C. Não há previsão de chuva. Deseja que eu envie o alerta do clima para os próximos dias?";
                break;
            case 2:
                msg = "Aqui estão as principais notícias do momento:\n"
                        + "\n"
                        + "Economia registra crescimento acima do esperado.\n"
                        + "\n"
                        + "Tecnologia: nova atualização de segurança para celulares.\n"
                        + "\n"
                        + "Esportes: seleção vence amistoso por 3 a 1.";
                break;
            case 3:
                msg = "Sua agenda de hoje tem dois compromissos:\n"
                        + "\n"
                        + "10h: reunião de projeto\n"
                        + "\n"
                        + "15h: consulta médica"; break;
            case 4:
                msg = "Claro! Deseja ouvir sua playlist favorita, músicas relaxantes ou prefere que eu escolha algo aleatório para animar o dia?"; break;
        }
        
        System.out.println(msg);
    }
}
