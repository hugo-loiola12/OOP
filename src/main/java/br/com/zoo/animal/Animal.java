package br.com.zoo.animal;

public class Animal {
    private int idade;
    private String nome;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() <= 50) {
            this.nome = nome;
        } else {
            System.out.println("ERRO: O nome deve ter no máximo 50 caracteres.");
        }
    }

    public int getIdade(int idade) {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 300) {
            System.out.println("Nenhum animal com essa idade.");
        } else {
            this.idade = idade;
        }
    }

    public void comer() {
        System.out.println("Animal " + nome + " está comendo.");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
