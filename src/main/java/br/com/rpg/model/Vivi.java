package br.com.rpg.model;

import br.com.rpg.util.DadoD20;

public class Vivi extends Personagem {

    public Vivi(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

    @Override
    public void atacar(Personagem alvo) {
        // Rolando o dado D20
        int dado = DadoD20.rolar();
        int danoFinal;

        // Verificando se é um acerto crítico ou erro crítico
        if (dado == 1) {
            System.out.println("Falha crítica! Magia falhou.");
            danoFinal = 0; // Magia falhou, nenhum dano causado
        } else if (dado == 20) {
            System.out.println("Dano Crítico!");
            // Dano crítico: o valor da magia é dobrado
            danoFinal = (mana * 2) - alvo.getDefesa();
        } else {
            // Ataque mágico normal
            danoFinal = (mana + dado) - alvo.getDefesa(); // O dado D20 influencia o ataque mágico
        }

        // Garante que o dano não seja negativo
        danoFinal = Math.max(danoFinal, 0);

        // Causa o dano ao alvo
        alvo.receberDano(danoFinal);

        // Exibe o resultado do ataque
        System.out.println("------------------------------------------------");
        System.out.println(nome + " lança magia negra em " + alvo.getNome() + " com um ataque de " + danoFinal + " pontos de dano.");
    }

    @Override
    public int vidaMaxima() {
        return vidaMaxima;
    }


}
