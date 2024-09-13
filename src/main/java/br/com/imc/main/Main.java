package br.com.imc.main;

import br.com.imc.pessoa.Atleta;
import br.com.imc.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa Hugo = new Pessoa("Hugo", 60, 1.75); // Instanciar Pessoa
        System.out.println("O IMC da Pessoa " + Hugo.getNome() + " é " + String.format("%.2f", Hugo.imcPessoa()));

        Atleta Hugostoso = new Atleta("Hugostoso", 65, 1.80, "Natação");// Instanciar Atleta
        System.out.println("O IMC do Atleta " + Hugostoso.getNome() + " é " + String.format("%.2f", Hugostoso.imcPessoa()));
    }
}
