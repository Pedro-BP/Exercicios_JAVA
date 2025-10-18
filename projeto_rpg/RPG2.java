package com.mycompany.projeto_rpg;

import static com.mycompany.projeto_rpg.CombateBoss.vidaJogador;
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

                case "1":
                    explorar();
                    break;

                case "2":
                    itens();
                    break;

                case "3":
                    loja();
                    break;

                case "4":
                    sair();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    pausa();
                    break;

            }

        }

    }

    static void mostrarStatus() {

        System.out.println("Seu status:");

        System.out.printf("  Nível: %d\n  XP: %d / %d\n  HP: %d\n  Ataque: %d\n  Ouro: %d\n  Inventário: %s\n", nivel, xp, xpParaSubir, hp, ataque, ouro, inventario);

        System.out.println("==========================================");
        System.out.println("Escolha sua ação:");
        System.out.println("  1. Explorar\n  2. Item\n  3. Loja\n  4. Sair");
        System.out.println("==========================================");

    }

    static void explorar() {

        System.out.println("Você decidiu explorar as terras perigosas...");
        int evento = random.nextInt(6) + 1;

        switch (evento) {

            case 1:
                batalha();
                break;
            case 2:
                tesouro();
                break;
            case 3:
                armadilha();
                break;
            case 4:
                andarilho();
                break;
            case 5:
                descansar();
                break;
            case 6:
                Scanner sc = new Scanner(System.in);
                Dungeon dungeon = new Dungeon(nivel);

                while (true) {
                    dungeon.mostrar();
                    if (dungeon.chegouNaSaida()) {
                        System.out.println("Você encontrou uma ROTA DE FUGA!");
                        System.out.println("\nVocê deseja SAIR ou continuar EXPLORANDO?");
                        System.out.println("[1] SAIR | [2] EXPLORAR");
                        int resp = sc.nextInt();
                        System.out.println("\n");
                        if (resp == 1) {
                            break;
                        } else {
                            dungeon.mostrar();
                        }
                    }
                    if (dungeon.encontrouChefe()) {
                        System.out.println("Você encontrou o CHEFE! Prepare-se para lutar!");
                        CombateBoss combate = new CombateBoss(nivel); // passa o nível do personagem
                        boolean venceu = combate.iniciarCombate();

                        if (venceu) {
                            System.out.println("\nVocê conquistou esta dungeon! 🏆");
                        } else {
                            if (vidaJogador <= 0) {
                                System.out.println("\nFim de jogo...");
                                break;
                            } else {
                                dungeon.mostrar();
                            }
                        }
                    }

                    System.out.print("Mover (w/a/s/d): ");
                    char comando = sc.next().charAt(0);
                    dungeon.mover(comando);
                }

        }

    }

    static void itens() {

        if (item.size() == 0) {

            System.out.println("Vazio");

        }

        if (item.size() == 1) {

            System.out.println("==========================================");
            System.out.println("Inventario:");
            System.out.printf("  1. %s\n ", item);
            System.out.println("==========================================");

        }

        if (item.size() == 2) {

            System.out.println("==========================================");
            System.out.println("Inventario:");
            System.out.printf("  1. %s\n 2. %s", item);
            System.out.println("==========================================");

        }

        String escolha = scanner.nextLine();

        if (escolha.equals("Poção")) {

            hp += 30;
            item.remove("Poçao");

        }

        if (escolha.equals("Elixir dos Deuses")) {

            hp *= 2;
            if (hp > 200) {
                hp = 200;
            }
            item.remove("Elixir dos Deuses");

        }

        pausa();

    }

    static void andarilho() {

        System.out.println("Welcome stranger...");

        while (true) {

            System.out.printf("Seu ouro: %d\n", ouro);
            System.out.println("Escolha o que deseja comprar:");
            System.out.println("  1. Espada vampiríca(+10 Ataque e recupera uma % de hp) - 500 Ouro");
            System.out.println("  2. Pedra Suspeita(???)- 5000 Ouro");
            System.out.println("  3. Elixir dos Deuses (???) - 10000 Ouro");
            System.out.println("  4. Voltar");
            System.out.print("Digite sua escolha (1/2/3/4): ");
            String compra = scanner.nextLine();

            if (compra.equals("1") && ouro >= 500) {

                ouro -= 500;
                ataque += 10;
                inventario = "Espada vampiríca";
                System.out.println("Você comprou a Espada vampíríca.");

            } else if (compra.equals("2") && ouro >= 5000) {

                ouro -= 5000;
                ressureicao = "Pedra Suspeita";
                System.out.println("Você comprou uma Pedra.");

            } else if (compra.equals("3") && ouro >= 10000) {

                ouro -= 1;
                item.add("Elixir dos Deuses");
                System.out.println("Você comprou o Elixir dos Deuses.");

            } else if (compra.equals("4")) {

                break;

            } else {

                System.out.println("Ouro insuficiente ou opção inválida.");

            }

            pausa();

        }

    }

    static void batalha() {

        int inimigoHp = 30 + random.nextInt(20);
        int inimigoAtaque = 5 + random.nextInt(5);

        System.out.println("Você encontrou um monstro!");

        System.out.printf("Inimigo - HP: %d | Ataque: %d\n", inimigoHp, inimigoAtaque);

        while (true) {

            System.out.printf("Seu HP: %d | HP do inimigo: %d\n", hp, inimigoHp);
            System.out.print("Escolha sua ação (1. Atacar / 2. Fugir): ");
            String escolha = scanner.nextLine();

            if (escolha.equals("1")) {

                inimigoHp -= ataque;

                if (inimigoHp <= 0) {

                    vitoriaBatalha();
                    break;

                }

                hp -= inimigoAtaque;
                if (hp <= 0) {

                    gameOver();
                    break;

                }

            } else if (escolha.equals("2")) {

                System.out.println("Você fugiu da batalha!");
                pausa();
                break;

            } else if (escolha.equals("1") && inventario == "Espada vampiríca") {

                inimigoHp -= ataque;
                hp += ataque / 5;

                if (inimigoHp <= 0) {

                    vitoriaBatalha();
                    break;

                }

                hp -= inimigoAtaque;
                if (hp <= 0) {

                    gameOver();
                    break;

                }

            } else {

                System.out.println("Opção inválida.");

            }

        }
    }

    static void vitoriaBatalha() {

        ouro += random.nextInt(20) + 1;
        xp += 10;
        System.out.printf("Você derrotou o inimigo e ganhou %d de ouro e 10 XP.\n", ouro);

        if (xp >= xpParaSubir) {

            nivel++;
            xp -= xpParaSubir;
            xpParaSubir += 20;
            ataque += 5;
            System.out.printf("Parabéns! Você subiu para o nível %d. Ataque agora é %d.\n", nivel, ataque);

        }

        pausa();

    }

    static void tesouro() {

        int ganho = 10 + random.nextInt(20);
        ouro += ganho;
        System.out.printf("Você encontrou um tesouro e ganhou %d de ouro.\n", ganho);
        pausa();

    }

    static void armadilha() {

        int dano = 10 + random.nextInt(10);
        hp -= dano;
        System.out.printf("Você caiu em uma armadilha e perdeu %d de HP.\n", dano);
        if (hp <= 0) {
            gameOver();
        } else {
            pausa();
        }

    }

    static void descansar() {

        int cura = 10 + random.nextInt(30);
        hp += cura;
        if (hp > 100) {
            hp = 100;
        }
        System.out.printf("Você descansou e recuperou %d de HP.\n", cura);
        pausa();

    }

    static void loja() {

        while (true) {

            System.out.printf("Seu ouro: %d\n", ouro);
            System.out.println("Escolha o que deseja comprar:");
            System.out.println("  1. Espada (+5 Ataque) - 50 Ouro");
            System.out.println("  2. Machado (+10 Ataque) - 100 Ouro");
            System.out.println("  3. Poção (+30 HP) - 30 Ouro");
            System.out.println("  4. Voltar");
            System.out.print("Digite sua escolha (1/2/3/4): ");
            String compra = scanner.nextLine();

            if (compra.equals("1") && ouro >= 50) {

                ouro -= 50;
                ataque += 5;
                inventario = "Espada";
                System.out.println("Você comprou uma Espada.");

            } else if (compra.equals("2") && ouro >= 100) {

                ouro -= 100;
                ataque += 10;
                inventario = "Machado";
                System.out.println("Você comprou um Machado.");

            } else if (compra.equals("3") && ouro >= 30) {

                ouro -= 30;
                item.add("Poção");
                System.out.println("Você comprou uma Poção.");

            } else if (compra.equals("4")) {

                break;

            } else {

                System.out.println("Ouro insuficiente ou opção inválida.");

            }

            pausa();

        }
    }

    static void gameOver() {

        if (ressureicao.equals("Pedra Suspeita")) {

            System.out.println("==========================================");
            System.out.println("              GAME OVER?");
            System.out.println("Você foi derrotado em sua aventura.");
            System.out.println("Você reviveu misteriosamente...");
            System.out.println("==========================================");
            pausa();
            hp = 100;

        } else {

            System.out.println("==========================================");
            System.out.println("              GAME OVER");
            System.out.println("Você foi derrotado em sua aventura.");
            System.out.println("==========================================");
            pausa();
            sair();
            System.exit(0);

        }

    }

    static void sair() {

        System.out.println("==========================================");
        System.out.println("Obrigado por jogar!");
        System.out.println("==========================================");

    }

    static void pausa() {

        System.out.println("Pressione ENTER para continuar...");
        scanner.nextLine();

        for (int i = 0; i < 50; i++) {

            System.out.println();

        }
    }
}