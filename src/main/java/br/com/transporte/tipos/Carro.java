package br.com.transporte.tipos;

import br.com.transporte.transporte.Transporte;

public class Carro implements Transporte {


    @Override
    public void mover() {
        System.out.println("O carro está se movendo pelas estraadas.");
    }
}
