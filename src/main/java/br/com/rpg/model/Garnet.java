package br.com.rpg.model;

public class Garnet extends Personagem {

    public Garnet(String nome, int vida, int ataque, int defesa, int mana) {
        super(nome, vida, ataque, defesa, mana);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " usa magia branca!");
        // Implementar a lógica do ataque/cura aqui
    }
}
