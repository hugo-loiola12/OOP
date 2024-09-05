package br.com.zoo.animal;

public class Mamifero extends Animal {
    private final String corPelo;
    private final int numeroSeios;

    public Mamifero(String nome, int idade, float peso, String corPelo, int numeroSeios) {
        super(nome, idade, peso);
        this.corPelo = corPelo;
        this.numeroSeios = numeroSeios;
    }

    public void getCorPelo() {
        System.out.println("A cor de pelo é do " + nome + " é " + corPelo);
    }

    public void getNumeroSeios() {
        System.out.println("O numero de seios é " + numeroSeios);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero " + nome);
    }

    @Override
    public void mover() {
        System.out.println("Mamifero " + nome + " movendo-se");
    }
}
