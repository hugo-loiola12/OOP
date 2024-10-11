package br.com.transporte.tipos;

import br.com.transporte.transporte.Transporte;

public class Bicicleta implements Transporte {


    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo pedalada.");
    }
}
