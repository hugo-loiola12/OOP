package br.com.rpg.model;

// Criar uma classe abstrata
public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int vidaMaxima;
    protected int ataque;
    protected int defesa;
    protected int mana;
    private int curasRestantes = 3;  // Cada personagem pode curar 3 vezes no máximo

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

    // Personagem ataca o alvo
    public abstract void atacar(Personagem alvo);

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

    public void receberDano(int dano) {
        // Calcula o dano recebido considerando a defesa, garantindo que não seja negativo
        int danoRecebido = Math.max(dano - defesa, 0);

        // Atualiza a vida, garantindo que ela não fique abaixo de zero
        vida = Math.max(vida - danoRecebido, 0);

        // Imprime o dano recebido e a vida restante
        System.out.println(nome + " recebeu " + danoRecebido + " de dano.");

        // Verifica se o personagem continua vivo
        if (vida == 0) {
            System.out.println(nome + " foi derrotado!");
        }
    }


    // Metodo para curar, considerando o limite de usos
    public void curar(int pontos) {
        if (curasRestantes > 0) {
            int curaPersonagem = vida + pontos;
            // Garante que a nova vida não ultrapasse a vida máxima (ou define um valor para a vida máxima)
            vida = Math.min(curaPersonagem, vidaMaxima());
            curasRestantes--;  // Reduz o número de curas restantes
            System.out.println(nome + " se curou com " + pontos + " pontos de vida. Vida atual: " + vida + ". Curas restantes: " + curasRestantes);
        } else {
            System.out.println(nome + " não pode mais se curar! Limite de curas alcançado.");
        }
    }

    // Método abstrato que retorna a vida máxima de cada personagem
    public abstract int vidaMaxima();
}
