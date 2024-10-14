package br.com.escola.classes;

public class Professor extends Pessoa {

    private String insricao;

    public Professor(String nome, String cpf, String telefone, String email, String endereco, String inscricao) {
        super(nome, cpf, telefone, email, endereco);
        this.insricao = inscricao;
    }

    public String getInsricao() {
        return insricao;
    }

    public void setInsricao(String insricao) {
        this.insricao = insricao;
    }
}
