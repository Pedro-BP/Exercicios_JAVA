package com.mycompany.projeto_rpg;

import java.util.Random;

// Estrutura Base - Metodos
public class Dungeon {

    private char[][] mapa;
    private int tamanho;
    private int jogadorX, jogadorY;
    private int saidaX, saidaY;
    private int chefeX, chefeY;
    private boolean[][] visitado;
    private Random random = new Random();

    public Dungeon(int nivel) {
        this.tamanho = calcularTamanho(nivel);
        this.mapa = new char[tamanho][tamanho];
        this.visitado = new boolean[tamanho][tamanho];
        gerarDungeon();
    }

    private int calcularTamanho(int nivel) {
        // 10 níveis de dungeon, de 5x5 a 15x15 por exemplo
        int indice = Math.min(nivel / 10, 9);
        return 5 + indice;
    }

    private void gerarDungeon() {
        // Preenche tudo como desconhecido
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                mapa[i][j] = '.';
            }
        }

        // Gera entrada nas bordas
        int borda = random.nextInt(4);
        switch (borda) {
            case 0 -> {
                jogadorX = 0;
                jogadorY = random.nextInt(tamanho);
            } // topo
            case 1 -> {
                jogadorX = tamanho - 1;
                jogadorY = random.nextInt(tamanho);
            } // baixo
            case 2 -> {
                jogadorX = random.nextInt(tamanho);
                jogadorY = 0;
            } // esquerda
            case 3 -> {
                jogadorX = random.nextInt(tamanho);
                jogadorY = tamanho - 1;
            } // direita
        }

        mapa[jogadorX][jogadorY] = 'E';
        visitado[jogadorX][jogadorY] = true;

        // Gera saída e chefe aleatoriamente em locais diferentes
        do {
            saidaX = random.nextInt(tamanho);
            saidaY = random.nextInt(tamanho);
        } while (saidaX == jogadorX && saidaY == jogadorY);

        do {
            chefeX = random.nextInt(tamanho);
            chefeY = random.nextInt(tamanho);
        } while ((chefeX == jogadorX && chefeY == jogadorY) || (chefeX == saidaX && chefeY == saidaY));
    }

    public void mover(char direcao) {
        int novoX = jogadorX, novoY = jogadorY;

        switch (direcao) {
            case 'w' ->
                novoX--;
            case 's' ->
                novoX++;
            case 'a' ->
                novoY--;
            case 'd' ->
                novoY++;
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
        visitado[jogadorX][jogadorY] = true;
    }

    public void mostrar() {
    System.out.println("\n╔ " + "═══".repeat(tamanho) + " ╗");
    for (int i = 0; i < tamanho; i++) {
        System.out.print("║");
        for (int j = 0; j < tamanho; j++) {
            if (i == jogadorX && j == jogadorY) {
                System.out.print(" & "); // jogador
            } else if (!visitado[i][j]) {
                System.out.print("   "); // área não explorada
            } else if (i == saidaX && j == saidaY) {
                System.out.print("[S]"); // saída
            } else if (i == chefeX && j == chefeY) {
                System.out.print("[C]"); // chefe
            } else {
                System.out.print(" * "); // área explorada
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