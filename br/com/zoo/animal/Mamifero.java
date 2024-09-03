package br.com.zoo.animal;

public class Mamifero extends Animal {
    private String corPelo;
    private int numeroSeios;

    public Mamifero(String nome, int idade, int peso, String corPelo, int numeroSeios) {
        super(nome, idade, peso);
        this.corPelo = corPelo;
        this.numeroSeios = numeroSeios;
    }

    public void getCorPelo() {
        System.out.println("A cor de pelo é " + corPelo);
    }

    public void getNumeroSeios() {
        System.out.println("O numero de seios é " + numeroSeios);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    @Override
    public void mover() {
        System.out.println("Mamifero movendo-se");
    }
}
