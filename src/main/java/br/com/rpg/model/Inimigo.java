package br.com.rpg.model;

public class Inimigo extends Personagem {
    public Inimigo(String nome, int vida, int ataque, int defesa, int magia) {
        super(nome, vida, ataque, defesa, magia);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println("Inimigo atacou " + alvo.getNome() + "!");

    }
}
