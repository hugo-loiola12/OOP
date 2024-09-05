package br.com.honda.veiculo;

public class veiculo {
    // Atributos da classe
    private final String marca;
    private final String modelo;
    private final String cor;

    // Construtores da classe
    public veiculo(String marca, String modelo, String cor) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    // Metodo
    public void acelerar() {
        System.out.println(modelo + " Acelerando");
    }

    // Metodo
    public void freiar() {
        System.out.println(modelo + " Freiando");
    }
}
