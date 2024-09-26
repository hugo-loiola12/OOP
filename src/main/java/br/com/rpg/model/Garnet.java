package br.com.rpg.model;

import br.com.rpg.util.DadoD20;

public class Garnet extends Personagem {

    public Garnet(String nome, int vida, int ataque, int defesa, int mana) {
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
            System.out.println(nome + " causou dano crítico com magia branca!");
            // Dano crítico: o valor de ataque é dobrado
            danoFinal = (mana * 2) - alvo.getDefesa();
        } else {
            // Ataque normal
            danoFinal = (mana + dado) - alvo.getDefesa(); // O dado D20 influencia o ataque baseado em mana
        }

        // Garante que o dano não seja negativo
        danoFinal = Math.max(danoFinal, 0);

        // Causa o dano ao alvo
        alvo.receberDano(danoFinal);

        // Exibe o resultado do ataque
        System.out.println("------------------------------------------------");
        System.out.println(nome + " lança magia branca em " + alvo.getNome() + " com um ataque de " + danoFinal + " pontos de dano.");
    }

    @Override
    public int vidaMaxima() {
        return vidaMaxima;
    }

}
