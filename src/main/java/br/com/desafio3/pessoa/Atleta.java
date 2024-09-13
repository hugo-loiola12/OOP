package br.com.desafio3.pessoa;

public class Atleta extends br.com.pessoa.Pessoa {
    private final String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }

    @Override
    public double imcPessoa(double peso, double altura) {
        double imc = 0;
        imc = peso / (altura * altura);
        imc = imc - (imc * ((double) 5 / 100));
        return imc;
    }
}
