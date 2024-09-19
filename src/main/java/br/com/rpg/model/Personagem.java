package br.com.rpg.model;

// Criar uma classe abstrata
public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int magia;

    public Personagem(String nome, int vida, int ataque, int defesa, int magia) {
        super();
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
    }

    // Verificar se o personagem está vivo
    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract void atacar(Personagem outro);

    public void receberDano(int dano) {
        // Dano recebido não ser negativo
        int danoRecebido = Math.max(dano - defesa, 0);
        // Atualizar a vida apos o dano recebido
        vida -= danoRecebido;
        // Se o dano for maior que a vida, o personagem morre
        if (estaVivo()) {
            System.out.println(nome + " recebeu " + danoRecebido + " de dano. Vida restante: " + vida);
        }
        System.out.println(nome + "está morto :(");

    }

    public void curar(int pontos) {

        int curaPersonagem = vida + pontos;
        // Garante que a nova vida não ultrapasse a vida máxima
        vida = Math.min(vida, curaPersonagem);
        System.out.println(nome + " recuperou " + pontos + " pontos de vida. Vida atual: " + vida);
    }
}
