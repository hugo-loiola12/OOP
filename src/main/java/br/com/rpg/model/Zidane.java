package br.com.rpg.model;

import br.com.rpg.util.DadoD20;

public class Zidane extends Personagem {

    public Zidane(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

    @Override
    public void atacar(Personagem alvo) {
        // Rolando o dado D20
        int dado = DadoD20.rolar();
        int ataqueFinal;

        // Verificando se é um acerto crítico ou um erro crítico
        if (dado == 1) {
            System.out.println("Dano Mínimo! Ataque falhou.");
            ataqueFinal = 0; // Ataque falha, nenhum dano causado
        } else if (dado == 20) {
            System.out.println("Dano Crítico!");
            // Dano crítico: o valor de ataque é dobrado
            ataqueFinal = (ataque * 2) - alvo.getDefesa();
        } else {
            // Ataque normal
            ataqueFinal = (ataque + dado) - alvo.getDefesa(); // O dado D20 influencia o ataque
        }

        // Garante que o ataque não cause dano negativo
        ataqueFinal = Math.max(ataqueFinal, 0);

        // Causa o dano no alvo
        alvo.receberDano(ataqueFinal);

    }

    @Override
    public int vidaMaxima() {
        return vidaMaxima;
    }

}
