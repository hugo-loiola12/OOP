package br.com.rpg.util;

import java.util.Random;

public class DadoD20 {
    private static final Random random = new Random();

    // Rola o dado de 20 faces para saber o resultado do ataque/cura
    public static int rolar() {
        return random.nextInt(20) + 1;  // Retorna um valor entre 1 e 'faces'
    }
}
