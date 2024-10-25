package br.com.energia.luzes;

import br.com.energia.padrao.InterruptorListener;

public class Luz implements InterruptorListener {

    private boolean acesa = false;

    @Override
    public void aoLigar() {
        this.acesa = true;
        System.out.println("Luz ligada");
    }

    @Override
    public void aoDesligar() {
        this.acesa = false;
        System.out.println("Luz desligada");
    }
}
