package honda.veiculo;

public class moto extends veiculo {

    private String materialPeDeDescanso;
    private String modeloGuidao;

    public moto(String marca, String modelo, String cor, String materialPeDeDescanso, String modeloGuidao) {
        super(marca, modelo, cor);
        this.materialPeDeDescanso = materialPeDeDescanso;
        this.modeloGuidao = modeloGuidao;
    }

    ;

    public void cair() {
        System.out.println("Caindo");
    }
}
