package br.com.transporte.tipos;

import br.com.transporte.contrato.Transporte;

public class MeioTransporte implements Transporte {

    protected int velocidade;
    protected int peso;
    protected int numeroPassageiros;

    public MeioTransporte(int velocidade, int peso, int numeroPassageiros) {
        super();
        this.velocidade = velocidade;
        this.peso = peso;
        this.numeroPassageiros = numeroPassageiros;
    }

    @Override
    public void mover() {
        System.out.println("O meio de contrato está se movendo.");
    }
}
