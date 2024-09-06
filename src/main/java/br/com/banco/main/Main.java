package br.com.banco.main;

import br.com.banco.conta.Conta;

public class Main {
    public static void main(String[] args) {
        Conta objConta = new Conta("Hugo", 123, 500.50);

        System.out.println(objConta.saldo());

        System.out.println(objConta.sacar(32));

        System.out.println(objConta.depositar(32));
    }
}
