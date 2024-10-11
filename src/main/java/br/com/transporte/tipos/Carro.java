package br.com.transporte.tipos;

public class Carro extends MeioTransporte {


    public Carro(int velocidade, int peso, int numeroPassageiros) {
        super(velocidade, peso, numeroPassageiros);
    }


    @Override
    public void mover() {
        System.out.println("O carro está se movendo pela rota urbana à " + velocidade + "km/h com " + numeroPassageiros + " passageiros.");
    }
}
