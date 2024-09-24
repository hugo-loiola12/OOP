package br.com.rpg;

import br.com.rpg.model.Zidane;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("-------------- Final Fantasy IX --------------");
        System.out.println();
        System.out.println("Escolha seu Personagem: ");
        System.out.println("1 - Zidane");
        System.out.println("2 - Garnet");
        System.out.println("3 - Vivi");
        System.out.println("4 - Steiner");

        Scanner classe = new Scanner(System.in);

        switch (classe.nextLine()) {
            case "1":
                System.out.println("O personagem escolhido foi Zidade!");
                Zidane zizu = new Zidane("Zidane", 50, 25, 15, 5);
                break;
            case "2":
                System.out.println("O personagem escolhido foi Garnet!");
                break;
            case "3":
                System.out.println("O personagem escolhido foi Vivi!");
                break;
            case "4":
                System.out.println("O personagem escolhido foi Steiner!");
                break;
            default:
                System.out.println("ERRO: Escolha uma classe!");
        }
    }
}
