package br.com.honda.veiculo;

public class Carro extends Veiculo {
    private final int tamanhoPortaLuvas;
    private final int qtdTapete;

    public Carro(String marca, String modelo, String cor, int tamanhoPortaLuvas, int qtdTapete) {
        super(marca, modelo, cor);
        this.tamanhoPortaLuvas = tamanhoPortaLuvas;
        this.qtdTapete = qtdTapete;
    }

    public void capota() {
        System.out.println("Capturando o carro");
    }
}
