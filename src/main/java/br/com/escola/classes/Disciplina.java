package br.com.escola.classes;

public class Disciplina {
    private String nome;
    private String descricao;
    private Professor professor;

    public Disciplina(String nome, String descricao, Professor professor) {
        super();
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
