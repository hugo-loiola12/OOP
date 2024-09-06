package br.com.banco.conta;

public class Conta {
    // Atributos
    private final String nome;
    private final int numero;
    private double saldo;

    // Construtor
    public Conta(String nome, int numero, double saldo) {
        super();
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public double saldo() {
        return saldo;
    }

    public double sacar(double valor) {
        return saldo -= valor;
    }

    public double depositar(double valor) {
        return saldo += valor;
    }
}
