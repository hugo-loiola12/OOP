package br.com.escola.main;

import br.com.escola.classes.Aluno;
import br.com.escola.classes.Disciplina;
import br.com.escola.classes.Professor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Aluno Hugo = new Aluno("Hugo", "057.073.821-65", "(61) 99186-2235", "hugoloiola.1@gmail.com", "Qno 3", "uc5500");

        Professor Ricardao = new Professor("Ricardão", "111.222.333-44", "(61) 9 9999-9999", "ricardai@gmail.com", "Vicente Pires", "54789512");

        Disciplina OOP = new Disciplina("Orientação a Objetos", "Esta aula ensina java", Ricardao);


    }
}
