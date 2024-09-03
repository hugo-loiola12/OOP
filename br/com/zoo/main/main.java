package br.com.zoo.main;

import br.com.zoo.animal.Ave;
import br.com.zoo.animal.Mamifero;

public class main {
    public static void main(String[] args) {

        Mamifero Cachorro = new Mamifero("Tótó", 5, 5, "Preto", 4);
        Cachorro.emitirSom();
        Cachorro.mover();
        Cachorro.getCorPelo();
        Cachorro.getNumeroSeios();

        System.out.println("==========================");

        Ave Calopsita = new Ave("Zézin", 2, 0.25F, "Brancas", true);
        Calopsita.emitirSom();
        Calopsita.mover();
        System.out.println(Calopsita.getCorDasPenas());
        Calopsita.setPodeVoar();
    }
}
