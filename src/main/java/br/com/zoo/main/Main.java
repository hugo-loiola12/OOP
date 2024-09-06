package br.com.zoo.main;

import br.com.zoo.animal.Ave;
import br.com.zoo.animal.Mamifero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mamifero Cachorro = new Mamifero("Betinho", 5, "Preto");
        System.out.println("Coloque a nova idade do cachorro " + Cachorro.getNome());
        Cachorro.setIdade(sc.nextInt());
        System.out.println("Este é o nova idade do cachorro " + Cachorro.getNome() + ": " + Cachorro.getIdade());

        // Limpar o buffer
        sc.nextLine();

        System.out.println("==================");

        Ave Passaro = new Ave("Zézin", 2, "Pontudo");
        System.out.println("Coloque o tipo de bico da ave " + Passaro.getNome());
        Passaro.setTipoBico(sc.nextLine());

    }
}
