package br.com.prova.quarto;

import java.util.Arrays;

// Herança
public class QuartoLuxo extends Quarto {
    public QuartoLuxo() {
        super(500, new String[]{"Tv com Netflix", "Spa"});
    }

    // Polimorfismo
    @Override
    public void reserva(int nNoites, double precoEstadia) {
        super.reserva(nNoites, precoEstadia);
        System.out.println("Juntamente com os servicos de " + Arrays.toString(servicos));
    }
}