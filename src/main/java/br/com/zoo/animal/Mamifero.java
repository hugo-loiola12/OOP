package br.com.zoo.animal;

public class Mamifero extends Animal {
    private final String corPelo;

    public Mamifero(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public void amamentar() {
        System.out.println("Mamifero amamentado");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor pelo: " + corPelo);
    }
}
