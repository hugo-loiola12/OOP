package br.com.energia.luzes;

import br.com.energia.padrao.InterruptorListener;

public class Interruptor {

    private InterruptorListener listener;

    public void adicionarListener(InterruptorListener listener){
        this.listener = listener;
    }

    public void ligar(){
        listener.aoLigar();
    }

    public void desligar(){
        listener.aoDesligar();
    }
}
