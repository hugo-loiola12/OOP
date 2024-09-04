package br.com.zoo.animal;

public class Ave extends Animal {

    private final String corDasPenas;
    private final boolean podeVoar;

    public Ave(String nome, int idade, float peso, String corDasPenas, boolean podeVoar) {
        super(nome, idade, peso);
        this.corDasPenas = corDasPenas;
        this.podeVoar = podeVoar;
    }

    public String getCorDasPenas() {
        return corDasPenas;
    }

    public void setPodeVoar() {
        if (podeVoar) {
            System.out.println(nome + " Pode voar");
        } else {
            System.out.println(nome + " Não pode voar");
        }
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave " + nome);
    }

    @Override
    public void mover() {
        System.out.println("Ave " + nome + " movendo-se");
    }
}
