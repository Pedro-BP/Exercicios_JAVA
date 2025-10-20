package com.mycompany.projeto_rpg;

import java.util.Random;
import java.util.Scanner;

public class CombateBoss {

    private int vidaJogador;
    private final int nivelJogador;
    private int vidaBoss;
    private int ataqueJogador;
    private int ataqueBoss;
    private final Random random = new Random();

    private String nomeBoss;
    private String tipoBoss;

    public CombateBoss(int nivel) {
        this.nivelJogador = nivel;
        definirTipoBoss();
        gerarAtributos();
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
        vidaJogador = RPG2.hp;
        ataqueJogador = RPG2.ataque + (nivelJogador / 2);

        vidaBoss = 80 + (nivelJogador * 10);
        ataqueBoss = (int) (8 + (nivelJogador / 1.5));

        switch (tipoBoss) {
            case "agressivo" ->
                ataqueBoss = (int) (ataqueBoss * 1.3);
            case "defensivo" ->
                vidaBoss = (int) (vidaBoss * 1.4);
            case "mágico" -> {
                ataqueBoss = (int) (ataqueBoss * 1.1);
                vidaBoss = (int) (vidaBoss * 1.1);
            }
            case "caótico" ->
                ataqueBoss = (int) (ataqueBoss * 1.6);
            case "lendário" -> {
                ataqueBoss = (int) (ataqueBoss * 1.8);
                vidaBoss = (int) (vidaBoss * 2.0);
            }
        }
    }

    public int iniciarCombate() {
        Scanner sc = RPG2.scanner;

        System.out.println("\n⚔️  O " + nomeBoss.toUpperCase() + " APARECEU! ⚔️");
        System.out.println("Um inimigo " + tipoBoss + " está diante de você!\n");

        while (vidaJogador > 0 && vidaBoss > 0) {
            System.out.println("=============================================");
            System.out.println("Sua vida: " + vidaJogador + " | Vida do Chefe: " + vidaBoss);
            System.out.println("=============================================");
            System.out.println("[1] Atacar");
            System.out.println("[2] Abrir inventário");
            System.out.println("[3] Fugir");
            System.out.print("Escolha sua ação: ");

            int escolha = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (escolha) {
                case 1 ->
                    atacar();
                case 2 ->
                    abrirInventarioDuranteCombate();
                case 3 -> {
                    System.out.println("Você tenta fugir...");
                    if (random.nextInt(100) < 30) {
                        System.out.println("Você conseguiu escapar!");
                        RPG2.hp = vidaJogador;
                        return -1;
                    } else {
                        System.out.println("O " + nomeBoss + " bloqueou sua fuga!");
                    }
                }
                default ->
                    System.out.println("Comando inválido!");
            }

            if (vidaBoss <= 0) {
                System.out.println("Você derrotou o " + nomeBoss + "! Parabéns!");
                int xpGanho = calcularXpRecompensa();
                RPG2.xp += xpGanho;
                System.out.println("✨ Você ganhou " + xpGanho + " de XP!");

                RPG2.hp = vidaJogador;
                return 1;
            }

            ataqueDoChefe();
        }

        if (vidaJogador <= 0) {
            System.out.println("Você foi derrotado pelo " + nomeBoss + "...");
            return 0;
        }
        return 0;
    }

    private void abrirInventarioDuranteCombate() {
        if (RPG2.item.isEmpty()) {
            System.out.println("Seu inventário está vazio!");
            return;
        }

        System.out.println("=== Inventário ===");
        for (int i = 0; i < RPG2.item.size(); i++) {
            System.out.println((i + 1) + ". " + RPG2.item.get(i));
        }
        System.out.print("Escolha um item para usar (ou 0 para voltar): ");
        int escolha = RPG2.scanner.nextInt();
        RPG2.scanner.nextLine();

        if (escolha == 0) {
            return;
        }
        if (escolha < 1 || escolha > RPG2.item.size()) {
            System.out.println("Escolha inválida.");
            return;
        }

        String itemUsado = RPG2.item.get(escolha - 1);
        switch (itemUsado) {
            case "Poção" -> {
                vidaJogador += 30;
                System.out.println("Você usa uma Poção e recupera 30 de HP!");
                if (vidaJogador > 100) {
                    vidaJogador = 100;
                }
                RPG2.item.remove(itemUsado);
            }
            case "Elixir dos Deuses" -> {
                vidaJogador *= 2;
                if (vidaJogador > 200) {
                    vidaJogador = 200;
                }
                System.out.println("Você usa o Elixir dos Deuses! Seu HP dobra!");
                RPG2.item.remove(itemUsado);
            }
            default ->
                System.out.println("Este item não pode ser usado agora.");
        }
    }

    private void atacar() {
        int dano = ataqueJogador + random.nextInt(6) - 2;
        System.out.println("Você ataca e causa " + dano + " de dano!");
        vidaBoss -= Math.max(dano, 0);
    }

    private void ataqueDoChefe() {
        int dano = ataqueBoss + random.nextInt(6) - 2;

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

    private int calcularXpRecompensa() {
        return switch (tipoBoss) {
            case "agressivo" ->
                50;
            case "defensivo" ->
                80;
            case "mágico" ->
                120;
            case "caótico" ->
                180;
            case "lendário" ->
                300;
            default ->
                50;
        };
    }
}
