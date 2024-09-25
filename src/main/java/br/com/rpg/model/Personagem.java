package br.com.rpg.model;

// Criar uma classe abstrata
public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int vidaMaxima;
    protected int ataque;
    protected int defesa;
    protected int mana;

    // Construtor do Personagem
    public Personagem(String nome, int vida, int ataque, int defesa, int mana) {
        super();
        this.nome = nome;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    // Getters e Setter gerados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getMana() {
        return mana;
    }

    public void setMagia(int mana) {
        this.mana = mana;
    }

    // Verificar se o personagem está vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    // Personagem ataca o alvo
    public abstract void atacar(Personagem alvo);

    public void receberDano(int dano) {
        // Dano recebido não ser negativo
        int danoRecebido = Math.max(dano - defesa, 0);
        // Atualizar a vida apos o dano recebido
        vida -= danoRecebido;
        // Se o dano for maior que a vida, o personagem morre
        if (estaVivo()) {
            System.out.println(nome + " recebeu " + danoRecebido + " de dano e ainda está vivo! Vida restante: " + vida);
        } else {
            System.out.println(nome + " está morto :(");
        }


    }

    // Metodo para curar o personagem
    public void curar(int pontos) {
        vida = Math.min(vida + pontos, vidaMaxima);  // Garante que a vida não ultrapasse a vida máxima
        System.out.println(nome + " recuperou " + pontos + " pontos de vida! Vida atual: " + vida);
    }
}
