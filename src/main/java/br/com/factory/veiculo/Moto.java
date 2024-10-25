package br.com.factory.veiculo;

public class Moto implements LigarVeiculo {

    @Override
    public void ligar() {
        System.out.println("Ligando Moto");
    }
}
