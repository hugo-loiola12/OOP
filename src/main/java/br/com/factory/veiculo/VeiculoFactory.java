package br.com.factory.veiculo;

public class VeiculoFactory {
    public LigarVeiculo criarVeiculo(String tipo, String nome, float preco) {
        if (tipo == "moto") {
            return new Moto(nome, preco);
        } else if (tipo == "carro") {
            return new Carro(nome, preco);
        }

        return null;
    }
}
