package ControleEstoque;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto.getNome());
    }

    public boolean removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produtos.remove(produto);
                return true;
            }
        }
        return false;
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.calcularValorTotal();
        }
        return valorTotal;
    }

    public String exibirProdutos() {
        if (produtos.isEmpty()) {
            return "Nenhum produto no estoque.";
        }
        StringBuilder info = new StringBuilder();
        for (Produto produto : produtos) {
            info.append(produto.toString()).append("\n");
        }
        return info.toString();
    }
}
