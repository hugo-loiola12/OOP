package br.com.rpg.model;

public class Steiner extends Personagem {

    public Steiner(String nome, int vida, int ataque, int defesa, int magia) {
        super(nome, vida, ataque, defesa, magia);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca com sua espada!");
        // Implementar a lógica do ataque aqui
    }
}
