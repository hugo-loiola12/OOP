package br.com.rpg.model;

import br.com.rpg.util.DadoD20;

public class Steiner extends Personagem {

    public Steiner(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

    @Override
    public void atacar(Personagem alvo) {
        // Rolando o dado D20
        int dado = DadoD20.rolar();
        int danoFinal;

        // Verificando se é um acerto crítico ou erro crítico
        if (dado == 1) {
            System.out.println(nome + " errou o ataque! Dano mínimo.");
            danoFinal = 0; // Ataque falhou, nenhum dano causado
        } else if (dado == 20) {
            System.out.println(nome + " causou dano crítico!");
            // Dano crítico: o valor de ataque é dobrado
            danoFinal = (ataque * 2) - alvo.getDefesa();
        } else {
            // Ataque normal
            danoFinal = (ataque + dado) - alvo.getDefesa(); // O dado D20 influencia o ataque
        }

        // Garante que o dano não seja negativo
        danoFinal = Math.max(danoFinal, 0);

        // Causa o dano ao alvo
        alvo.receberDano(danoFinal);

        // Exibe o resultado do ataque
        System.out.println("------------------------------------------------");
        System.out.println(nome + " ataca com sua espada " + alvo.getNome() + " com um ataque de " + danoFinal + " pontos de dano.");
    }

    @Override
    public int vidaMaxima() {
        return vidaMaxima;
    }


}
