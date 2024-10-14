package br.com.escola.classes;

import java.util.List;

public class Turma {

    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> aluno;

    public Turma(String nome, Professor professor, Disciplina disciplina, List<Aluno> aluno) {
        super();
        this.professor = professor;
        this.disciplina = disciplina;
        this.aluno = aluno;
    }


    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }
}
