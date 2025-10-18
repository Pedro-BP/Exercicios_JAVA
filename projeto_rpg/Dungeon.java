package com.mycompany.projeto_rpg;

import java.util.Random;

public class Dungeon {

    private char[][] mapa;
    private int tamanho;
    private int jogadorX, jogadorY;
    private int saidaX, saidaY;
    private int chefeX, chefeY;
    private boolean[][] visitado;
    private Random random = new Random();

    // Novos atributos
    private char[][] conteudoSala; // Guarda o tipo de sala: 'T', 'I', 'A', 'M', ' ' etc.

    public Dungeon(int nivel) {
        this.tamanho = calcularTamanho(nivel);
        this.mapa = new char[tamanho][tamanho];
        this.visitado = new boolean[tamanho][tamanho];
        this.conteudoSala = new char[tamanho][tamanho];
        gerarDungeon();
    }

    private int calcularTamanho(int nivel) {
        int indice = Math.min(nivel / 10, 9);
        return 5 + indice;
    }

    private void gerarDungeon() {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                mapa[i][j] = '.';
                conteudoSala[i][j] = gerarConteudoAleatorio();
            }
        }

        // Gera entrada nas bordas
        int borda = random.nextInt(4);
        switch (borda) {
            case 0 -> { jogadorX = 0; jogadorY = random.nextInt(tamanho); }
            case 1 -> { jogadorX = tamanho - 1; jogadorY = random.nextInt(tamanho); }
            case 2 -> { jogadorX = random.nextInt(tamanho); jogadorY = 0; }
            case 3 -> { jogadorX = random.nextInt(tamanho); jogadorY = tamanho - 1; }
        }

        mapa[jogadorX][jogadorY] = 'E';
        visitado[jogadorX][jogadorY] = true;
        conteudoSala[jogadorX][jogadorY] = ' '; // entrada nunca tem evento

        // Saída e chefe
        do {
            saidaX = random.nextInt(tamanho);
            saidaY = random.nextInt(tamanho);
        } while (saidaX == jogadorX && saidaY == jogadorY);

        do {
            chefeX = random.nextInt(tamanho);
            chefeY = random.nextInt(tamanho);
        } while ((chefeX == jogadorX && chefeY == jogadorY) || (chefeX == saidaX && chefeY == saidaY));

        conteudoSala[chefeX][chefeY] = 'C';
        conteudoSala[saidaX][saidaY] = 'S';
    }

    private char gerarConteudoAleatorio() {
        int chance = random.nextInt(100);
        if (chance < 10) return 'T'; // 10% chance de tesouro
        if (chance < 18) return 'I'; // 8% chance de inimigo
        if (chance < 20) return 'A'; // 2% chance de Andarilho
        if (chance < 23) return 'M'; // 3% chance de Armadilha
        return ' '; // sala vazia
    }

    public void mover(char direcao) {
        int novoX = jogadorX, novoY = jogadorY;

        switch (direcao) {
            case 'w' -> novoX--;
            case 's' -> novoX++;
            case 'a' -> novoY--;
            case 'd' -> novoY++;
            default -> {
                System.out.println("Comando inválido!");
                return;
            }
        }

        if (novoX < 0 || novoX >= tamanho || novoY < 0 || novoY >= tamanho) {
            System.out.println("Você não pode sair da dungeon!");
            return;
        }

        jogadorX = novoX;
        jogadorY = novoY;

        if (!visitado[jogadorX][jogadorY]) {
            visitado[jogadorX][jogadorY] = true;
            ativarEventoSala();
        }
    }

    private void ativarEventoSala() {
        char evento = conteudoSala[jogadorX][jogadorY];
        switch (evento) {
            case 'T' -> {
                System.out.println("💰 Você encontrou um TESOURO!");
                int ganho = 25 + random.nextInt(75);
                RPG2.ouro += ganho;
                System.out.println("Você encontrou " + ganho + " de ouro!");
            }
            case 'I' -> {
                System.out.println("⚔️ Um inimigo aparece!");
                RPG2.batalha();
            }
            case 'A' -> {
                System.out.println("👤 Você encontra um ANDARILHO misterioso...");
                RPG2.andarilho(); // chama o método já existente no seu código
            }
            case 'M' -> {
                System.out.println("☠️ Você ativou uma ARMADILHA!");
                RPG2.armadilha(); // chama o método que você já tem pronto
            }
            case ' ' -> System.out.println("Você entra em uma sala vazia...");
        }
        conteudoSala[jogadorX][jogadorY] = ' '; // evita repetir evento
    }

    public void mostrar() {
        System.out.println("\n╔ " + "═══".repeat(tamanho) + " ╗");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("║");
            for (int j = 0; j < tamanho; j++) {
                if (i == jogadorX && j == jogadorY) {
                    System.out.print(" & ");
                } else if (!visitado[i][j]) {
                    System.out.print("   ");
                } else if (i == saidaX && j == saidaY) {
                    System.out.print("[S]");
                } else if (i == chefeX && j == chefeY) {
                    System.out.print("[C]");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("║");
        }
        System.out.println("╚ " + "═══".repeat(tamanho) + " ╝");
    }

    public boolean chegouNaSaida() {
        return jogadorX == saidaX && jogadorY == saidaY;
    }

    public boolean encontrouChefe() {
        return jogadorX == chefeX && jogadorY == chefeY;
    }
}
