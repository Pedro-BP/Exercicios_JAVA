package com.mycompany.projeto_rpg;

import static com.mycompany.projeto_rpg.RPG2.ataque;
import static com.mycompany.projeto_rpg.RPG2.hp;
import java.util.Random;
import java.util.Scanner;

public class CombateBoss {

    static int vidaJogador;
    private int nivelJogador;
    private int vidaBoss;
    private int ataqueJogador;
    private int ataqueBoss;
    private Random random = new Random();

    private String nomeBoss; // nome do chefe
    private String tipoBoss; // tipo de comportamento (agressivo, defensivo, mágico etc.)

    public CombateBoss(int nivel) {
        this.nivelJogador = nivel;
        definirTipoBoss();     // define o estilo do chefe
        gerarAtributos();      // gera atributos conforme o nível e o tipo
    }

    private void definirTipoBoss() {
        if (nivelJogador < 20) {
            nomeBoss = "Goblin Rei";
            tipoBoss = "agressivo";
        } else if (nivelJogador < 40) {
            nomeBoss = "Cavaleiro Sombrio";
            tipoBoss = "defensivo";
        } else if (nivelJogador < 60) {
            nomeBoss = "Mago Ancião";
            tipoBoss = "mágico";
        } else if (nivelJogador < 80) {
            nomeBoss = "Demônio de Fogo";
            tipoBoss = "caótico";
        } else {
            nomeBoss = "Dragão Ancestral";
            tipoBoss = "lendário";
        }
    }

    private void gerarAtributos() {
    // Agora sincroniza com o HP real do jogador
    vidaJogador = RPG2.hp;
    ataqueJogador = RPG2.ataque + (nivelJogador / 2);

    // Base do chefe
    vidaBoss = 80 + (nivelJogador * 10);
    ataqueBoss = (int) (8 + (nivelJogador / 1.5));

    // Modificadores de tipo
    switch (tipoBoss) {
        case "agressivo" -> ataqueBoss *= 1.3;
        case "defensivo" -> vidaBoss *= 1.4;
        case "mágico" -> {
            ataqueBoss *= 1.1;
            vidaBoss *= 1.1;
        }
        case "caótico" -> ataqueBoss *= 1.6;
        case "lendário" -> {
            ataqueBoss *= 1.8;
            vidaBoss *= 2.0;
        }
    }
}

    public boolean iniciarCombate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n⚔️  O " + nomeBoss.toUpperCase() + " APARECEU! ⚔️");
        System.out.println("Um inimigo " + tipoBoss + " está diante de você!\n");

        while (vidaJogador > 0 && vidaBoss > 0) {
            System.out.println("=============================================");
            System.out.println("Sua vida: " + vidaJogador + " | Vida do Chefe: " + vidaBoss);
            System.out.println("=============================================");
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
                        System.out.println("O " + nomeBoss + " bloqueou sua fuga!");
                    }
                }
                default -> System.out.println("Comando inválido!");
            }

            if (vidaBoss <= 0) {
                System.out.println("Você derrotou o " + nomeBoss + "! Parabéns!");
                RPG2.hp = vidaJogador; // sincroniza a vida final do jogador com o jogo principal
                return true;
            }

            // Turno do chefe
            ataqueDoChefe();
        }

        if (vidaJogador <= 0) {
            System.out.println("Você foi derrotado pelo " + nomeBoss + "...");
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

        // comportamento especial conforme o tipo
        switch (tipoBoss) {
            case "mágico" -> {
                if (random.nextInt(100) < 25) {
                    System.out.println("O " + nomeBoss + " lança uma magia poderosa!");
                    dano *= 1.5;
                }
            }
            case "caótico" -> {
                if (random.nextInt(100) < 15) {
                    System.out.println("O " + nomeBoss + " entra em frenesi!");
                    dano *= 2;
                }
            }
            case "lendário" -> {
                if (random.nextInt(100) < 20) {
                    System.out.println("🔥 O " + nomeBoss + " exala chamas infernais!");
                    dano *= 2.5;
                }
            }
        }

        System.out.println("O " + nomeBoss + " ataca e causa " + dano + " de dano!");
        vidaJogador -= Math.max(dano, 0);
    }

}
