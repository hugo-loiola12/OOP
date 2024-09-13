package br.com.desafio3.pessoa;

public class Pessoa {
    private final String nome;
    private final double peso;
    private final double altura;

    public Pessoa(String nome, double peso, double altura) {
        super();
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double imcPessoa(double peso, double altura) {
        double imc = 0;
        imc = peso / (altura * altura);
        return imc;
    }
}
