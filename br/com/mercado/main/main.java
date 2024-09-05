package br.com.mercado.main;


import br.com.mercado.produtos.produtos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner nomeProduto = new Scanner(System.in);
        System.out.println("Coloque o nome do produto");

        Scanner precoProduto = new Scanner(System.in);
        System.out.println("Coloque o preço do produto");

        produtos produto = new produtos(nomeProduto.nextLine(), precoProduto.nextDouble());

        System.out.println(produto.getNome());

        System.out.println(produto.getPreco());
    }
}
