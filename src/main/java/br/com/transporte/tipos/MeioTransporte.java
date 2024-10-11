package br.com.transporte.tipos;

import br.com.transporte.contrato.Transporte;

public class MeioTransporte implements Transporte {

    protected float velocidade;
    protected double peso;
    protected int numeroPassageiros;

    public MeioTransporte(int velocidade, int peso, int numeroPassageiros) {
        super();
        this.velocidade = velocidade;
        this.peso = peso;
        this.numeroPassageiros = numeroPassageiros;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public void mover() {
        System.out.println("O meio de contrato está se movendo.");
    }
}
