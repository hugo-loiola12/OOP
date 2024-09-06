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
        if (tipoBico == null || tipoBico.isEmpty()) {
            System.out.println("ERRO: O tipo de bico não pode ser vazio.");
        } else if (!tipoBico.equalsIgnoreCase("Pontudo") && !tipoBico.equalsIgnoreCase("Curvo") && !tipoBico.equalsIgnoreCase("Plano")) {
            System.out.println("ERRO: Tipo de bico inválido. Tipos permitidos: Pontudo, Curvo, Plano.");
        } else {
            this.tipoBico = tipoBico;
        }
    }

    @Override
    public void setIdade(int idade) {

        if (idade < 0) {
            System.out.println("ERRO: Idade negativa");
        } else if (idade > 20) {
            System.out.println("ERRO: Ave com idade maior que 20");
        } else {
            super.setIdade(idade);
        }
    }


    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo de bico: " + tipoBico);
    }
}
