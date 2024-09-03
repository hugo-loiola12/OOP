package br.com.zoo.animal;

public class Ave extends Animal {

    private String corDasPenas;
    private boolean podeVoar;

    public Ave(String nome, int idade, int peso, String corDasPenas, boolean podeVoar) {
        super(nome, idade, peso);
        this.corDasPenas = corDasPenas;
        this.podeVoar = podeVoar;
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setPodeVoar() {
        if (podeVoar) {
            System.out.println("Pode voar");
        } else {
            System.out.println("Não pode voar");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }

    @Override
    public void mover() {
        System.out.println("Ave movendo-se");
    }
}
