package br.com.rpg;

import br.com.rpg.model.*;

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
        // Scanner para o usuario colocar um número
        Scanner scanner = new Scanner(System.in);
        // Saber qual personagem foi escolhido pelo usuário
        Personagem personagemEscolhido = null;

        String escolha = scanner.nextLine();


        switch (escolha) {
            case "1":
                System.out.println("O personagem escolhido foi Zidane!");
                personagemEscolhido = new Zidane("Zidane", 150, 35, 25, 0);
                break;
            case "2":
                System.out.println("O personagem escolhido foi Garnet!");
                personagemEscolhido = new Garnet("Garnet", 120, 10, 15, 100);
                break;
            case "3":
                System.out.println("O personagem escolhido foi Vivi!");
                personagemEscolhido = new Vivi("Vivi", 100, 5, 10, 150);
                break;
            case "4":
                System.out.println("O personagem escolhido foi Steiner!");
                personagemEscolhido = new Steiner("Steiner", 200, 45, 40, 0);
                break;
            default:
                System.out.println("ERRO: Escolha uma classe válida!");
                break;
        }

        // Mostre os dados do personagem escolhido, se a escolha foi válida
        if (personagemEscolhido != null) {
            System.out.println("Nome: " + personagemEscolhido.getNome());
            System.out.println("Vida: " + personagemEscolhido.getVida());
            System.out.println("Ataque: " + personagemEscolhido.getAtaque());
            System.out.println("Defesa: " + personagemEscolhido.getDefesa());
            System.out.println("Mana: " + personagemEscolhido.getMagia());
        }
    }
}
