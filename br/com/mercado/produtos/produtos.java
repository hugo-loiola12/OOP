package br.com.mercado.produtos;

public class produtos {
    public final String nome;
    public final double preco;

    public produtos(String nome, double preco) {
        super();
        this.nome = nome;

        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }
}
