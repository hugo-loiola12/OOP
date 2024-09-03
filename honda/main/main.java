package honda.main;

import honda.veiculo.carro;
import honda.veiculo.moto;

public class main {
    public static void main(String[] args) {
        carro objCarro = new carro("Tesla", "CyberTruck", "Chumbo", 50, 5);
        objCarro.acelerar();
        objCarro.freiar();
        objCarro.capota();

        System.out.println("==========================");

        moto objMoto = new moto("BMW", "GS1250R", "Branca", "Titanio", "CR288");
        objMoto.acelerar();
        objMoto.freiar();
        objMoto.cair();

    }
}
