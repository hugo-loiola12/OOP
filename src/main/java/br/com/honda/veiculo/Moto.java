package br.com.honda.veiculo;

public class Moto extends Veiculo {

    private final String materialPeDeDescanso;
    private final String modeloGuidao;

    public Moto(String marca, String modelo, String cor, String materialPeDeDescanso, String modeloGuidao) {
        super(marca, modelo, cor);
        this.materialPeDeDescanso = materialPeDeDescanso;
        this.modeloGuidao = modeloGuidao;
    }


    public void cair() {
        System.out.println("Caindo");
    }
}
