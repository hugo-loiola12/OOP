package br.com.zoo.animal;

public class Ave extends Animal {
    private String tipoBico;

    public Ave(String nome, int idade, String tipoBico) {
        super(nome, idade);
        this.tipoBico = tipoBico;
    }

    public void voar() {
        System.out.println("Ave voando");
    }

    // Getter para tipoBico
    public String getTipoBico() {
        return tipoBico;
    }

    // Setter para tipoBico
    public void setTipoBico(String tipoBico) {
        this.tipoBico = tipoBico;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de bico: " + tipoBico);
    }
}
