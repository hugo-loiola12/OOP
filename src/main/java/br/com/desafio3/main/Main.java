package br.com.desafio3.main;


import br.com.desafio3.pessoa.Atleta;
import br.com.desafio3.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa Hugo = new Pessoa("Hugo", 60, 1.75); // Instanciar Pessoa
        System.out.println("O IMC da pessoa " + Hugo.getNome() + " é " + Hugo.imcPessoa(Hugo.getPeso(), Hugo.getAltura()));

        Atleta Hugostoso = new Atleta("Hugostoso", 65, 1.80, "Natação");// Instanciar Atleta
    }
}