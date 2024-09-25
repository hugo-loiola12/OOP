package br.com.rpg.model;

public class Vivi extends Personagem {

    public Vivi(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }


    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " lança magia negra!");
        // Implementar a lógica do ataque aqui
    }
}
