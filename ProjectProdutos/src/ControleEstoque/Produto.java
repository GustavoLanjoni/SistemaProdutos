package ControleEstoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private String fornecedor;

    public Produto(String nome, double preco, int quantidade, String fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double calcularValorTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome +
               "\nPreço: " + preco +
               "\nQuantidade: " + quantidade +
               "\nFornecedor: " + fornecedor +
               "\nValor Total em Estoque: " + calcularValorTotal() + "\n";
    }
}
