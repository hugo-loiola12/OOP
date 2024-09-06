package br.com.honda.veiculo;

public class Veiculo {
    private final String marca;
    private final String modelo;
    private final String cor;

    public Veiculo(String marca, String modelo, String cor) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void acelerar() {
        System.out.println(modelo + " acelerando...");
    }

    public void frear() {
        System.out.println(modelo + " freando...");
    }
}
