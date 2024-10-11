package br.com.transporte.tipos;

import br.com.transporte.transporte.Transporte;

public class Onibus implements Transporte {
    @Override
    public void mover() {
        System.out.println("O ônibus está se movendo pela rota urbana.");
    }
}
