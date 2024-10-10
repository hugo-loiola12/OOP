package br.com.prova.main;

import br.com.prova.quarto.QuartoLuxo;
import br.com.prova.quarto.QuartoSimples;
import br.com.prova.quarto.SuitePresidencial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Receber dados do usuário
        Scanner scanner = new Scanner(System.in);


        System.out.println("---------- Reserva ----------");
        System.out.println("Escolha o número de dias da sua estadia:");
        int noites = scanner.nextInt();
        System.out.println("Agora escolha o quarto:");
        System.out.println("1 - Quarto Simples");
        System.out.println("2 - Quarto de Luxo");
        System.out.println("3 - Suíte Presidencial");
        // Limpar o buffer
        scanner.nextLine();
        String quarto = scanner.nextLine();

        switch (quarto) {
            case "1":
                QuartoSimples quartoSimples = new QuartoSimples();
                quartoSimples.reserva(noites, quartoSimples.getPrecoEstadia());
                break;
            case "2":
                QuartoLuxo quartoLuxo = new QuartoLuxo();
                quartoLuxo.reserva(noites, quartoLuxo.getPrecoEstadia());
                break;
            case "3":
                SuitePresidencial suitePresidencial = new SuitePresidencial();
                suitePresidencial.reserva(noites, suitePresidencial.getPrecoEstadia());
                break;
            default:
                System.out.println("Escolha um quarto!");
                break;
        }

    }
}