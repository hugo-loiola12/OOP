package br.com.prova.quarto;

import java.util.Arrays;

// Herança
public class SuitePresidencial extends Quarto {
    public SuitePresidencial() {
        super(1000, new String[]{"Tv com Netflix", "Spa", "Café da Manhã"});
    }

    // Polimorfismo
    @Override
    public void reserva(int nNoites, double precoEstadia) {
        super.reserva(nNoites, precoEstadia);
        System.out.println("Juntamente com os servicos de " + Arrays.toString(servicos));
    }
}