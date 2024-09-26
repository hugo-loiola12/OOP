package br.com.rpg.util;

import br.com.rpg.model.Personagem;

import java.util.Random;
import java.util.Scanner;

public class Batalha {
    private final Personagem p1;
    private final Personagem p2;

    // A batalha recebe dois personagens para batalhar
    public Batalha(Personagem p1, Personagem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciarBatalha() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();  // Para decisões aleatórias de p2

        System.out.println("-------------- Batalha iniciada! --------------");
        System.out.println();
        System.out.println(" A batalha começou entre " + p1.getNome() + " e " + p2.getNome());
        System.out.println();
        System.out.println("------------------------------------------------");

        boolean turnoP1 = true;  // Inicia com o turno do p1


        // Enquanto os dois personagens estiverem vivos, a batalha continua
        while (p1.estaVivo() && p2.estaVivo()) {
            int cura = random.nextInt(30); // Curar até 30 pontos
            if (turnoP1) {
                // Turno do jogador (p1)
                System.out.println(p1.getNome() + ", é o seu turno!");
                System.out.println("Escolha:");
                System.out.println("1 - Atacar");
                System.out.println("2 - Curar");
                System.out.println("3 - Fugir");
                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        p1.atacar(p2);
                        break;
                    case 2:
                        p1.curar(cura);
                        break;
                    case 3:
                        return;  // Termina a batalha
                    default:
                        System.out.println("Opção inválida. Perdeu o turno.");
                        break;
                }
            } else {
                // Turno do adversário (p2)
                System.out.println(p2.getNome() + " está se preparando...");

                // Ajuste para que o inimigo ataque mais do que cure
                int acaoP2 = random.nextInt(4); // 0, 1, 2 = atacar, 3 = curar

                switch (acaoP2) {
                    case 0:
                    case 1:
                    case 2:
                        p2.atacar(p1);  // 75% de chance de atacar
                        break;
                    case 3:
                        p2.curar(cura);  // 25% de chance de curar
                        break;
                    default:
                        System.out.println(p2.getNome() + " falhou em sua ação!");
                        break;
                }
            }

            // Mostra a vida dos dois personagens após cada turno
            System.out.println(p1.getNome() + " - Vida: " + p1.getVida());
            System.out.println(p2.getNome() + " - Vida: " + p2.getVida());
            System.out.println("------------------------------------------------");

            // Alterna o turno
            turnoP1 = !turnoP1;
        }

        // Verifica o resultado da batalha
        if (p1.estaVivo()) {
            System.out.println("------------------------------------------------------------------");
            System.out.println(p1.getNome() + " venceu a batalha!");
        } else {
            System.out.println("------------------------------------------------------------------");
            System.out.println(p2.getNome() + " venceu a batalha!");
        }
    }
}
