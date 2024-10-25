package br.com.factory.veiculo;

public class Carro implements LigarVeiculo {

    private String nome;
    private float preco;

    public Carro(String nome, float preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Carro");
    }
}
