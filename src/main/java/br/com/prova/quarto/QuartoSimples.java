package br.com.prova.quarto;

import java.util.Arrays;

// Herança
public class QuartoSimples extends Quarto {
    public QuartoSimples() {
        super(120, new String[]{"Tv com Netflix"});
    }

    // Polimorfismo
    @Override
    public void reserva(int nNoites, double precoEstadia) {
        super.reserva(nNoites, precoEstadia);
        System.out.println("Juntamente com os servicos de " + Arrays.toString(servicos));
    }
}