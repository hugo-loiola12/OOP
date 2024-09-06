package br.com.zoo.main;

import br.com.zoo.animal.Ave;
import br.com.zoo.animal.Mamifero;

public class Main {
    public static void main(String[] args) {

        Mamifero Cachorro = new Mamifero("Betinho", 5, "Preto");

        Cachorro.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        System.out.println("==================");

        Ave Passaro = new Ave("Zézin", 2, "Pontudo");
        Passaro.exibirInfo();
    }
}
