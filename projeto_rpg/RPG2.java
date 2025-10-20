package com.mycompany.projeto_rpg;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RPG2 {

    static int hp = 100, ataque = 10, ouro = 0, nivel = 1, xp = 0, xpParaSubir = 20;
    static String inventario = "Espada de Madeira";
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String ressureicao = "";
    static ArrayList<String> item = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("           Bem-vindo ao RPG!");
        System.out.println("==========================================");

        while (true) {
            mostrarStatus();
            System.out.print("Digite sua escolha (1/2/3/4): ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1" ->
                    explorar();
                case "2" ->
                    itens();
                case "3" ->
                    loja();
                case "4" ->
                    sair();
                default -> {
                    System.out.println("Opção inválida.");
                    pausa();
                }
            }
        }
    }

    static void mostrarStatus() {
        System.out.println("Seu status:");
        System.out.printf("  Nível: %d\n  XP: %d / %d\n  HP: %d\n  Ataque: %d\n  Ouro: %d\n  Inventário: %s\n",
                nivel, xp, xpParaSubir, hp, ataque, ouro, inventario);
        System.out.println("==========================================");
        System.out.println("Escolha sua ação:");
        System.out.println("  1. Explorar\n  2. Itens\n  3. Loja\n  4. Sair");
        System.out.println("==========================================");
    }

    static void explorar() {
        System.out.println("Você decidiu explorar as terras perigosas...");

        int chance = random.nextInt(100);

        if (chance < 35) {
            batalha();
        } else if (chance < 55) {
            tesouro();
        } else if (chance < 70) {
            armadilha();
        } else if (chance < 85) {
            andarilho();
        } else if (chance < 95) {
            descansar();
        } else {
            entrarDungeon();
        }
    }

    static void entrarDungeon() {
        System.out.println("Você encontrou uma antiga dungeon misteriosa!");
        Dungeon dungeon = new Dungeon(nivel);
        Scanner sc = new Scanner(System.in);

        while (true) {
            dungeon.mostrar();

            if (dungeon.chegouNaSaida()) {
                System.out.println("🚪 Você encontrou uma ROTA DE FUGA!");
                System.out.println("[1] SAIR | [2] CONTINUAR EXPLORANDO");
                int resp = sc.nextInt();
                sc.nextLine();
                if (resp == 1) {
                    break;
                }
            }

            System.out.print("Mover (w/a/s/d): ");
            char comando = sc.next().charAt(0);
            dungeon.mover(comando);

            if (hp <= 0) {
                gameOver();
                break;
            }
        }
    }

    static void batalha() {
        int inimigoHp = 30 + random.nextInt(20);
        int inimigoAtaque = 5 + random.nextInt(5);

        System.out.println("⚔️ Você encontrou um monstro!");
        while (inimigoHp > 0 && hp > 0) {
            System.out.printf("Seu HP: %d | HP do inimigo: %d\n", hp, inimigoHp);
            System.out.print("Escolha sua ação (1.Atacar / 2.Inventário / 3.Fugir): ");
            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1" -> {
                    inimigoHp -= ataque;
                    if (inventario.equals("Espada vampiríca")) {
                        hp += ataque / 5;
                    }
                    if (inimigoHp <= 0) {
                        vitoriaBatalha();
                        return;
                    }
                    hp -= inimigoAtaque;
                }
                case "2" ->
                    usarItemCombate();
                case "3" -> {
                    System.out.println("Você fugiu da batalha!");
                    pausa();
                    return;
                }
                default ->
                    System.out.println("Opção inválida!");
            }

            if (hp <= 0) {
                gameOver();
            }
        }
    }

    static void usarItemCombate() {
        if (item.isEmpty()) {
            System.out.println("Seu inventário está vazio!");
            return;
        }

        System.out.println("=== Itens Disponíveis ===");
        for (int i = 0; i < item.size(); i++) {
            System.out.println((i + 1) + ". " + item.get(i));
        }
        System.out.print("Escolha um item ou 0 para voltar: ");
        String escolha = scanner.nextLine();

        if (escolha.equals("0")) {
            return;
        }
        int idx = Integer.parseInt(escolha) - 1;

        if (idx >= 0 && idx < item.size()) {
            String usado = item.get(idx);
            if (usado.equals("Poção")) {
                hp += 30;
                System.out.println("Você recuperou 30 de HP!");
            } else if (usado.equals("Elixir dos Deuses")) {
                hp = Math.min(200, hp * 2);
                System.out.println("Você se sente invencível!");
            }
            item.remove(idx);
        }
    }

    static void itens() {
        if (item.isEmpty()) {
            System.out.println("Inventário vazio.");
        } else {
            System.out.println("=== Itens ===");
            for (int i = 0; i < item.size(); i++) {
                System.out.println((i + 1) + ". " + item.get(i));
            }
        }
        pausa();
    }

    static void andarilho() {
        System.out.println("Welcome, stranger...");
        while (true) {
            System.out.printf("Seu ouro: %d\n", ouro);
            System.out.println("  1. Espada Vampírica (+10 ATQ e roubo de vida) - 500 Ouro");
            System.out.println("  2. Pedra Suspeita (Ressurreição) - 5000 Ouro");
            System.out.println("  3. Elixir dos Deuses (x2 HP) - 10000 Ouro");
            System.out.println("  4. Voltar");
            System.out.print("Escolha: ");
            String compra = scanner.nextLine();

            switch (compra) {
                case "1" -> {
                    if (ouro >= 500) {
                        ouro -= 500;
                        ataque += 10;
                        inventario = "Espada vampiríca";
                        System.out.println("Você comprou a Espada Vampírica!");
                    } else {
                        System.out.println("Ouro insuficiente!");
                    }
                }
                case "2" -> {
                    if (ouro >= 5000) {
                        ouro -= 5000;
                        ressureicao = "Pedra Suspeita";
                        System.out.println("Você comprou a Pedra Suspeita!");
                    } else {
                        System.out.println("Ouro insuficiente!");
                    }
                }
                case "3" -> {
                    if (ouro >= 10000) {
                        ouro -= 10000;
                        item.add("Elixir dos Deuses");
                        System.out.println("Você comprou o Elixir dos Deuses!");
                    } else {
                        System.out.println("Ouro insuficiente!");
                    }
                }
                case "4" -> {
                    return;
                }
                default ->
                    System.out.println("Opção inválida!");
            }
            pausa();
        }
    }

    static void vitoriaBatalha() {
        int ganho = random.nextInt(20) + 10;
        ouro += ganho;
        xp += 10;
        System.out.printf("Você venceu! +%d de ouro, +10 XP.\n", ganho);

        if (xp >= xpParaSubir) {
            nivel++;
            xp -= xpParaSubir;
            xpParaSubir += 20;
            ataque += 5;
            System.out.printf("✨ Subiu para o nível %d! Ataque: %d.\n", nivel, ataque);
        }
        pausa();
    }

    static void tesouro() {
        int ganho = 10 + random.nextInt(20);
        ouro += ganho;
        System.out.printf("💰 Você encontrou um tesouro e ganhou %d de ouro.\n", ganho);
        pausa();
    }

    static void armadilha() {
        int dano = 10 + random.nextInt(10);
        hp -= dano;
        System.out.printf("💀 Uma armadilha! Você perdeu %d de HP.\n", dano);
        if (hp <= 0) {
            gameOver();
        }
        pausa();
    }

    static void descansar() {
        int cura = 10 + random.nextInt(30);
        hp = Math.min(100, hp + cura);
        System.out.printf("Você descansou e recuperou %d de HP.\n", cura);
        pausa();
    }

    static void loja() {
        while (true) {
            System.out.printf("Seu ouro: %d\n", ouro);
            System.out.println("  1. Espada (+5 ATQ) - 50 Ouro");
            System.out.println("  2. Machado (+10 ATQ) - 100 Ouro");
            System.out.println("  3. Poção (+30 HP) - 30 Ouro");
            System.out.println("  4. Voltar");
            System.out.print("Escolha: ");
            String compra = scanner.nextLine();

            switch (compra) {
                case "1" -> {
                    if (ouro >= 50) {
                        ouro -= 50;
                        ataque += 5;
                        inventario = "Espada";
                        System.out.println("Você comprou uma Espada!");
                    } else {
                        System.out.println("Ouro insuficiente!");
                    }
                }
                case "2" -> {
                    if (ouro >= 100) {
                        ouro -= 100;
                        ataque += 10;
                        inventario = "Machado";
                        System.out.println("Você comprou um Machado!");
                    } else {
                        System.out.println("Ouro insuficiente!");
                    }
                }
                case "3" -> {
                    if (ouro >= 30) {
                        ouro -= 30;
                        item.add("Poção");
                        System.out.println("Você comprou uma Poção!");
                    } else {
                        System.out.println("Ouro insuficiente!");
                    }
                }
                case "4" -> {
                    return;
                }
                default ->
                    System.out.println("Opção inválida!");
            }
            pausa();
        }
    }

    static void gameOver() {
        if (ressureicao.equals("Pedra Suspeita")) {
            System.out.println("⚡ A Pedra Suspeita brilha... Você reviveu!");
            hp = 100;
            ressureicao = "";
        } else {
            System.out.println("💀 GAME OVER 💀");
            sair();
            System.exit(0);
        }
    }

    static void sair() {
        System.out.println("==========================================");
        System.out.println("Obrigado por jogar!");
        System.out.println("==========================================");
        System.exit(0);
    }

    static void pausa() {
        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}
