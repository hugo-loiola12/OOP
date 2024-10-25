package br.com.factory.veiculo;

public class Carro implements LigarVeiculo {
    
    @Override
    public void ligar() {
        System.out.println("Ligando Carro");
    }
}
