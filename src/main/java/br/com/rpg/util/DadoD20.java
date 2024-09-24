package br.com.rpg.util;

import java.util.Random;

public class Dado {
    private static final Random random = new Random();

    public static int rolar(int faces) {
        return random.nextInt(faces) + 1;  // Retorna um valor entre 1 e 'faces'
    }
}
