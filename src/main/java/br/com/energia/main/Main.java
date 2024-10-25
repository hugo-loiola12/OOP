package br.com.energia.main;

import br.com.energia.luzes.Interruptor;
import br.com.energia.luzes.Luz;

public class Main {
    public static void main(String[] args){

        Interruptor objInterruptor = new Interruptor();

        Luz objLuz = new Luz();

        objInterruptor.adicionarListener(objLuz);

        objInterruptor.ligar();
    }
}
