package br.com.transporte.tipos;


import br.com.transporte.contrato.Transporte;

public class Onibus extends MeioTransporte implements Transporte {


    public Onibus(int velocidade, int peso, int numeroPassageiros) {
        super(velocidade, peso, numeroPassageiros);
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está se movendo pela rota urbana à " + velocidade + "km/h com " + numeroPassageiros + " passageiros.");
    }
}
