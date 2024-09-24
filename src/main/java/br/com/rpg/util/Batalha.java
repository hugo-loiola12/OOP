package br.com.rpg.util;

import br.com.rpg.model.Personagem;

public class Batalha {
    private final Personagem p1;
    private final Personagem p2;

    public Batalha(Personagem p1, Personagem p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciarBatalha() {

        System.out.println("------------------------------------------------------------------");
        System.out.println(p1.getNome() + " iniciado com sucesso!");
        System.out.println("A batalha começou entre " + p1.getNome() + " e " + p2.getNome());
        System.out.println("------------------------------------------------------------------");

        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("Coloque a sua opção: ");
            System.out.println("1 - Atacar");
            System.out.println("2 - Curar");
        }

        if (p1.estaVivo()) {

            System.out.println("------------------------------------------------------------------");
            System.out.println(p1.getNome() + " venceu a batalha!");
        } else {

            System.out.println("------------------------------------------------------------------");
            System.out.println(p2.getNome() + " venceu a batalha!");
        }
    }
}
