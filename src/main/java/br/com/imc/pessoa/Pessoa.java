package br.com.imc.pessoa;

public class Pessoa {
    protected String nome;
    protected double peso;
    protected double altura;

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

    public double imcPessoa() {
        double imc = 0;
        imc = peso / (altura * altura);
        return imc;
    }
}
