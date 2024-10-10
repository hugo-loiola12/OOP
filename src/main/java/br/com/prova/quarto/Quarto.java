package br.com.prova.quarto;

public class Quarto {
    // Encapsulamento
    protected double precoEstadia;
    protected String[] servicos;


    public Quarto(double precoEstadia, String[] servicos) {
        super();
        this.precoEstadia = precoEstadia;
        this.servicos = servicos;
    }

    public double getPrecoEstadia() {
        return precoEstadia;
    }

    public void setPrecoEstadia(float precoEstadia) {
        this.precoEstadia = precoEstadia;
    }

    public String[] getServicos() {
        return servicos;
    }

    public void setServicos(String[] servicos) {
        this.servicos = servicos;
    }

    public double precoEstadiaTotal(int noites, double preco) {
        return noites * preco;
    }


    public void reserva(int nNoites, double precoEstadia) {
        double valorFinal = precoEstadiaTotal(nNoites, precoEstadia);
        System.out.println("A reserva do quarto escolhido por " + nNoites + " noites ficou no total R$" + valorFinal);
    }
}