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

    // Metodos
    public double getSaldo() {
        return saldo;
    }

    public double sacar(double valorSaque) {
        if (saldo >= valorSaque) {
            return saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente");
            return valorSaque;
        }
    }

    public double depositar(double valorDeposito) {
        return saldo += valorDeposito;
    }
}
