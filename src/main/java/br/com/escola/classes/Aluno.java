package br.com.escola.classes;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String cpf, String telefone, String email, String endereco, String matricula) {
        super(nome, cpf, telefone, email, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}