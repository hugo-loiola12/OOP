package br.com.rpg.util;

import br.com.rpg.model.Personagem;

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


        System.out.println("-------------- Batalha iniciada! --------------");
        System.out.println();
        System.out.println("A batalha começou entre " + p1.getNome() + " e " + p2.getNome());
        System.out.println("------------------------------------------------");
        // While que roda até um dos personagens morrer, ou fugir
        do {
            System.out.println("Escolha:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Curar");
            System.out.println("3 - Fugir");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println(p1.getNome() + " atacou " + p2.getNome());
                p1.atacar(p2);
            } else if (escolha == 2) {
                p1.curar(30);
                System.out.println(p1.getNome() + " se curou!");
            } else if (escolha == 3) {
                System.out.println(p1.getNome() + " conseguiu fugir!");
                return;
            }

        } while (p1.estaVivo() && p2.estaVivo());

        if (p1.estaVivo()) {

            System.out.println("------------------------------------------------------------------");
            System.out.println(p1.getNome() + " venceu a batalha!");
        } else {

            System.out.println("------------------------------------------------------------------");
            System.out.println(p2.getNome() + " venceu a batalha!");
        }
    }
}
