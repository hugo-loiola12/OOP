package br.com.transporte.tipos;


public class Onibus extends MeioTransporte {


    public Onibus(int velocidade, int peso, int numeroPassageiros) {
        super(velocidade, peso, numeroPassageiros);
    }

    @Override
    public void mover() {
        System.out.println("O ônibus está se movendo pela rota urbana à " + velocidade + "km/h com " + numeroPassageiros + " passageiros.");
    }
}
