package br.com.imc.pessoa;

public class Atleta extends Pessoa {
    protected String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    @Override
    public double imcPessoa() {
        double imc = 0;
        imc = peso / (altura * altura);
        imc = imc - (imc * ((double) 5 / 100));
        return imc;
    }
}
