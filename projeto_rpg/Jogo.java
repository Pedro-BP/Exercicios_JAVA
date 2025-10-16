package com.mycompany.projeto_rpg;

import static com.mycompany.projeto_rpg.CombateBoss.vidaJogador;
import java.util.Scanner;

//Classe principal para testar

public class Jogo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dungeon dungeon = new Dungeon(10);

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
                CombateBoss combate = new CombateBoss(10); // passa o nível do personagem
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