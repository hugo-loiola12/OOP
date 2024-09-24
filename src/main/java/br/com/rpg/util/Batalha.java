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
        System.out.println("A batalha começou entre " + p1.getNome() + " e " + p2.getNome());

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);
            if (p2.estaVivo()) {
                p2.atacar(p1);
            }
        }

        if (p1.estaVivo()) {
            System.out.println(p1.getNome() + " venceu a batalha!");
        } else {
            System.out.println(p2.getNome() + " venceu a batalha!");
        }
    }
}
