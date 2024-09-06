package br.com.honda.main;

import br.com.honda.veiculo.Carro;
import br.com.honda.veiculo.Moto;

public class Main {
    public static void main(String[] args) {
        Carro objCarro = new Carro("Tesla", "Cyber Truck", "Chumbo", 50, 5);
        objCarro.acelerar();
        objCarro.frear();
        objCarro.capota();

        Moto objMoto = new Moto("BMW", "GS1250R", "Branca", "Titanio", "CR288");
        objMoto.acelerar();
        objMoto.frear();
        objMoto.cair();
    }
}
