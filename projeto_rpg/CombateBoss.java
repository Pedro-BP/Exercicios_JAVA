package com.mycompany.projeto_rpg;

import java.util.Random;
import java.util.Scanner;

public class CombateBoss {

    static int vidaJogador;
    private int vidaBoss;
    private int ataqueJogador;
    private int ataqueBoss;
    private int nivel;
    private Random random = new Random();

    public CombateBoss(int nivel) {
        this.nivel = nivel;
        gerarAtributos();
    }

    private void gerarAtributos() {
        // Atributos escalam com o nível
        vidaJogador = 100 + (nivel * 5);
        ataqueJogador = 10 + (nivel / 2);

        // Boss é mais forte proporcionalmente
        vidaBoss = 80 + (nivel * 10);
        ataqueBoss = (int) (8 + (nivel / 1.5));
    }

    public boolean iniciarCombate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nO CHEFE APARECEU! ");
        System.out.println("Um inimigo poderoso está diante de você!\n");

        while (vidaJogador > 0 && vidaBoss > 0) {
            System.out.println("====================================");
            System.out.println("Sua vida: " + vidaJogador + " | Vida do Chefe: " + vidaBoss);
            System.out.println("====================================");
            System.out.println("[1] Atacar");
            System.out.println("[2] Defender");
            System.out.println("[3] Curar");
            System.out.println("[4] Fugir");
            System.out.print("Escolha sua ação: ");

            int escolha = sc.nextInt();
            System.out.println();

            switch (escolha) {
                case 1 -> atacar();
                case 2 -> defender();
                case 3 -> curar();
                case 4 -> {
                    System.out.println("Você tenta fugir...");
                    if (random.nextInt(100) < 30) {
                        System.out.println("Você conseguiu escapar!");
                        return false;
                    } else {
                        System.out.println("O chefe bloqueou sua fuga!");
                    }
                }
                default -> System.out.println("Comando inválido!");
            }

            if (vidaBoss <= 0) {
                System.out.println("Você derrotou o chefe! Parabéns!");
                return true;
            }

            // Turno do chefe
            ataqueDoChefe();
        }

        if (vidaJogador <= 0) {
            System.out.println("Você foi derrotado pelo chefe...");
            return false;
        }

        return true;
    }

    private void atacar() {
        int dano = ataqueJogador + random.nextInt(6) - 2;
        System.out.println("Você ataca e causa " + dano + " de dano!");
        vidaBoss -= Math.max(dano, 0);
    }

    private void defender() {
        int dano = Math.max((ataqueBoss / 2) - random.nextInt(3), 0);
        System.out.println("Você se defende! Recebe apenas " + dano + " de dano.");
        vidaJogador -= dano;
    }

    private void curar() {
        int cura = 10 + random.nextInt(10);
        vidaJogador += cura;
        System.out.println("Você se cura em " + cura + " pontos de vida.");
    }

    private void ataqueDoChefe() {
        int dano = ataqueBoss + random.nextInt(6) - 2;
        System.out.println("O chefe ataca e causa " + dano + " de dano!");
        vidaJogador -= Math.max(dano, 0);
    }
}