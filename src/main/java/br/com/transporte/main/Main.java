package br.com.transporte.main;

import br.com.transporte.tipos.Bicicleta;
import br.com.transporte.tipos.Carro;
import br.com.transporte.tipos.Onibus;

public class Main {
    public static void main(String[] args) {


        Carro obj1 = new Carro();
        obj1.mover();


        Bicicleta obj2 = new Bicicleta();
        obj2.mover();


        Onibus obj3 = new Onibus();
        obj3.mover();
    }
}
