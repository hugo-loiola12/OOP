package br.com.transporte.main;

import br.com.transporte.tipos.Bicicleta;
import br.com.transporte.tipos.Carro;
import br.com.transporte.tipos.Onibus;

public class Main {
    public static void main(String[] args) {


        Carro obj1 = new Carro(80, 1500, 5);
        obj1.mover();


        Bicicleta obj2 = new Bicicleta(10, 20, 2);
        obj2.mover();


        Onibus obj3 = new Onibus(50, 5000, 50);
        obj3.mover();
    }
}
