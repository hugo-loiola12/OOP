package br.com.factory.main;

import br.com.factory.veiculo.Carro;
import br.com.factory.veiculo.Moto;
import br.com.factory.veiculo.VeiculoFactory;

public class Main {
    public static void main(String[] args) {
        VeiculoFactory fabrica = new VeiculoFactory();

        Moto moto = (Moto) fabrica.criarVeiculo("moto", "CB650R", 50000);
        System.out.println("Nome: " + moto.getNome());
        moto.ligar();

        Carro carro = (Carro) fabrica.criarVeiculo("carro", "Civic", 110000);
        System.out.println("Nome: " + carro.getNome());
        moto.ligar();

    }
}
