package br.com.banco.main;

import br.com.banco.conta.Conta;

public class main {
    public static void main(String[] args) {
        Conta objConta = new Conta("Hugo", 1, 10);

        System.out.println("R$" + objConta.getSaldo());
        objConta.sacar(10.5);
        System.out.println("R$" + objConta.getSaldo());
        objConta.depositar(50);
        System.out.println("R$" + objConta.getSaldo());
    }
}
