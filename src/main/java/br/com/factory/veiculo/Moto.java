package br.com.factory.veiculo;

public class Moto implements LigarVeiculo {

    private String nome;
    private float preco;

    public Moto(String nome, float preco) {
        super();
        this.nome = nome;
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando Moto");
    }
}
