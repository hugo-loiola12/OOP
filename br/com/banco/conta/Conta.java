package br.com.banco.conta;

public class Conta {
    // Atributos
    private final String nome;
    private final int numero;
    private final double saldo;

    // Construtor
    public Conta(String nome, int numero, double saldo) {
        super();
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Metodos
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
