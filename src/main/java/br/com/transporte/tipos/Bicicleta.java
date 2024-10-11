package br.com.transporte.tipos;

public class Bicicleta extends MeioTransporte {


    public Bicicleta(int velocidade, int peso, int numeroPassageiros) {
        super(velocidade, peso, numeroPassageiros);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo pela rota urbana à " + velocidade + "km/h com " + numeroPassageiros + " passageiros.");
    }
}
