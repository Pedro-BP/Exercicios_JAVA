package com.mycompany.projeto_rpg;

import java.util.*;
import static com.mycompany.projeto_rpg.CombateBoss.vidaJogador;

public class RPG2 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static int nivel = 1;
    static int hp = 100;
    static int ouro = 0;
    static int dano = 10;
    static List<String> inventario = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("=== Bem-vindo ao RPG de Texto! ===");
        System.out.println("Você acorda em uma floresta misteriosa...");

        while (true) {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1. Explorar");
            System.out.println("2. Ver status");
            System.out.println("3. Ver inventário");
            System.out.println("4. Usar item");
            System.out.println("5. Sair do jogo");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> explorar();
                case 2 -> verStatus();
                case 3 -> verInventario();
                case 4 -> itens();
                case 5 -> {
                    System.out.println("Encerrando o jogo...");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    // =====================================
    // MÉTODOS PRINCIPAIS
    // =====================================

    static void explorar() {
        int evento = random.nextInt(6) + 1; // 1 a 6

        switch (evento) {
            case 1 -> batalha();
            case 2 -> tesouro();
            case 3 -> armadilha();
            case 4 -> andarilho();
            case 5 -> descansar();
            case 6 -> entrarDungeon();
        }
    }

    // =====================================
    // EVENTOS
    // =====================================

    static void batalha() {
        int vidaInimigo = 30 + random.nextInt(20 * nivel);
        int danoInimigo = 5 + random.nextInt(5 * nivel);
        System.out.println("\nVocê encontrou um inimigo!");

        while (vidaInimigo > 0 && hp > 0) {
            System.out.println("HP do inimigo: " + vidaInimigo);
            System.out.println("Seu HP: " + hp);
            System.out.println("1. Atacar  |  2. Fugir");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                int danoCausado = dano + random.nextInt(10);
                vidaInimigo -= danoCausado;
                System.out.println("Você causou " + danoCausado + " de dano!");

                if (vidaInimigo <= 0) {
                    System.out.println("Inimigo derrotado!");
                    int ouroGanho = 10 + random.nextInt(20);
                    ouro += ouroGanho;
                    System.out.println("Você ganhou " + ouroGanho + " de ouro!");
                    nivel++;
                    System.out.println("Você subiu para o nível " + nivel + "!");
                    return;
                }

                int danoRecebido = danoInimigo;
                hp -= danoRecebido;
                System.out.println("O inimigo causou " + danoRecebido + " de dano!");
            } else {
                System.out.println("Você fugiu da batalha!");
                return;
            }

            if (hp <= 0) {
                System.out.println("Você foi derrotado...");
                System.exit(0);
            }
        }
    }

    static void tesouro() {
        System.out.println("Você encontrou um baú!");
        int chance = random.nextInt(100);
        if (chance < 60) {
            System.out.println("Você encontrou uma Poção de Cura!");
            inventario.add("Poção");
        } else if (chance < 85) {
            System.out.println("Você encontrou uma Espada Vampírica!");
            inventario.add("Espada Vampírica");
        } else {
            int ouroAchado = 50 + random.nextInt(100);
            System.out.println("Você encontrou " + ouroAchado + " de ouro!");
            ouro += ouroAchado;
        }
    }

    static void armadilha() {
        int danoTomado = 10 + random.nextInt(15);
        hp -= danoTomado;
        System.out.println("Você caiu em uma armadilha e perdeu " + danoTomado + " de HP!");
        if (hp <= 0) {
            System.out.println("Você morreu...");
            System.exit(0);
        }
    }

    static void andarilho() {
        System.out.println("Você encontrou um andarilho misterioso.");
        System.out.println("Ele oferece itens raros:");
        System.out.println("1. Poção (50 ouro)");
        System.out.println("2. Elixir dos Deuses (10.000 ouro)");
        System.out.println("3. Sair");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1 -> {
                if (ouro >= 50) {
                    ouro -= 50;
                    inventario.add("Poção");
                    System.out.println("Você comprou uma Poção!");
                } else System.out.println("Ouro insuficiente.");
            }
            case 2 -> {
                if (ouro >= 10000) {
                    ouro -= 10000;
                    inventario.add("Elixir dos Deuses");
                    System.out.println("Você comprou o Elixir dos Deuses!");
                } else System.out.println("Ouro insuficiente.");
            }
            default -> System.out.println("O andarilho se despede e vai embora.");
        }
    }

    static void descansar() {
        System.out.println("Você encontrou um local seguro e descansou.");
        hp = 100 + (nivel * 10);
        System.out.println("Sua vida foi restaurada completamente!");
    }

    static void entrarDungeon() {
        System.out.println("Você encontrou uma entrada para uma dungeon sombria...");
        CombateBoss.vidaJogador = hp;
        Dungeon dungeon = new Dungeon(nivel);

        while (true) {
            dungeon.mostrarDungeon();
            System.out.println("Mover (w/a/s/d) ou (x) para sair:");
            char movimento = sc.next().charAt(0);

            if (movimento == 'x') {
                System.out.println("Você saiu da dungeon.");
                break;
            }

            dungeon.moverJogador(movimento);

            if (dungeon.chegouNaSaida()) {
                System.out.println("Você chegou à saída da dungeon!");
                break;
            }

            if (dungeon.encontrouChefe()) {
                System.out.println("Você encontrou o chefe da dungeon!");
                CombateBoss combate = new CombateBoss(nivel);
                combate.iniciarCombate();
                if (CombateBoss.vidaJogador <= 0) {
                    System.out.println("Você foi derrotado pelo chefe...");
                    System.exit(0);
                } else {
                    System.out.println("Você derrotou o chefe e limpou a dungeon!");
                    break;
                }
            }
        }

        hp = CombateBoss.vidaJogador;
    }

    // =====================================
    // INVENTÁRIO E STATUS
    // =====================================

    static void verStatus() {
        System.out.println("\n=== STATUS ===");
        System.out.println("Nível: " + nivel);
        System.out.println("HP: " + hp);
        System.out.println("Dano: " + dano);
        System.out.println("Ouro: " + ouro);
        pausa();
    }

    static void verInventario() {
        System.out.println("\n=== INVENTÁRIO ===");
        if (inventario.isEmpty()) System.out.println("Você não possui itens.");
        else inventario.forEach(System.out::println);
        pausa();
    }

    static void itens() {
        if (inventario.isEmpty()) {
            System.out.println("Você não possui itens!");
            return;
        }

        System.out.println("Escolha um item para usar:");
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }

        int escolha = sc.nextInt();
        if (escolha < 1 || escolha > inventario.size()) {
            System.out.println("Opção inválida.");
            return;
        }

        String item = inventario.get(escolha - 1);

        if (item.equals("Poção")) {
            hp += 50;
            if (hp > 100 + (nivel * 10)) hp = 100 + (nivel * 10);
            System.out.println("Você usou uma Poção e recuperou HP!");
            inventario.remove(item);
        } else if (item.equals("Espada Vampírica")) {
            dano += 10;
            System.out.println("Você equipou a Espada Vampírica! Dano aumentado!");
            inventario.remove(item);
        } else if (item.equals("Elixir dos Deuses")) {
            hp = 100 + (nivel * 50);
            dano += 50;
            System.out.println("O poder dos deuses flui em você!");
            inventario.remove(item);
        } else {
            System.out.println("Item desconhecido.");
        }
    }

    static void pausa() {
        System.out.println("\nPressione ENTER para continuar...");
        sc.nextLine();
        sc.nextLine();
    }
}
