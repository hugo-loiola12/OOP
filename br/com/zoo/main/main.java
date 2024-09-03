package br.com.zoo.main;

import br.com.zoo.animal.Mamifero;
import br.com.zoo.animal.Ave;

public class main {
    public static void main(String[] args) {
        Mamifero Cachorro = new Mamifero("Tótó", 5, 5, "Preto", 4);
        Cachorro.emitirSom();
        Cachorro.mover();

    }
}
