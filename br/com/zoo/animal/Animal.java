package br.com.zoo.animal;

public class Animal {
    private String nome;
    private int idade;
    private int peso;

    public Animal(String nome, int idade, int peso) {
        super();
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void mover() {
        System.out.println("Movendo-se");
    }

    public void emitirSom() {
        System.out.println("Emitir Som");
    }
}
