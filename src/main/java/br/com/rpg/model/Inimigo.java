package br.com.rpg.model;

import br.com.rpg.util.DadoD20;

public class Inimigo extends Personagem {
    public Inimigo(String nome, int vida, int ataque, int defesa, int magia) {
        super(nome, vida, ataque, defesa, magia);
    }

    @Override
    public void atacar(Personagem alvo) {
        int dado = DadoD20.rolar();
        if (dado == 1) {
            System.out.println("Dano Mínimo!");
        } else if (dado == 20) {
            System.out.println("Dano Crítico!");
        }
        int defesaAlvo = (alvo.getDefesa() * dado) / 10;
        int ataqueInimigo = (ataque * defesaAlvo) / 10;
        alvo.receberDano(ataqueInimigo);
        System.out.println(nome + " ataca com suas mãos " + alvo.getNome() + " com um ataque de " + ataqueInimigo);
    }
}
