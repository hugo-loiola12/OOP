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
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("ERRO: Idade negativa");
        } else if (idade > 50) {
            System.out.println("ERRO: Mamífero com idade maior que 50");
        } else {
            super.setIdade(idade);
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cor pelo: " + corPelo);
    }
}
