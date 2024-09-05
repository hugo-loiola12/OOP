package br.com.zoo.animal;

public class Animal {
    public final String nome;
    public final int idade;
    public final float peso;

    public Animal(String nome, int idade, float peso) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void mover() {
        System.out.println(nome + " Movendo-se");
    }

    public void emitirSom() {
        System.out.println(nome + " Emitir Som");
    }
}
