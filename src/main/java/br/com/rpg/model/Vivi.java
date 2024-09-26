package br.com.rpg.model;

import br.com.rpg.util.DadoD20;

public class Vivi extends Personagem {

    public Vivi(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }


    @Override
    public void atacar(Personagem alvo) {
        int dado = DadoD20.rolar();
        if (dado == 1) {
            System.out.println("Dano Mínimo!");
        } else if (dado == 20) {
            System.out.println("Dano Crítico!");
        }
        int ataqueVivi = (mana * alvo.getDefesa()) / 10;
        alvo.receberDano(ataqueVivi);
        System.out.println(nome + " lança magia negra em " + alvo.getNome() + " com um ataque de " + ataqueVivi);
    }
}
