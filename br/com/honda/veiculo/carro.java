package br.com.honda.veiculo;

public class carro extends veiculo {
    private final int tamanhoPortaLuvas;
    private final int qtdTapete;

    public carro(String marca, String modelo, String cor, int tamanhoPortaLuvas, int qtdTapete) {
        super(marca, modelo, cor);
        this.tamanhoPortaLuvas = tamanhoPortaLuvas;
        this.qtdTapete = qtdTapete;
    }

    public void capota() {
        System.out.println("Capotando");
    }
}
