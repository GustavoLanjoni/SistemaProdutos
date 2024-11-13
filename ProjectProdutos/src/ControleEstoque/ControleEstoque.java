package ControleEstoque;

import javax.swing.JOptionPane;

public class ControleEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        int opcao;

        do {
            String menu = """
                    1. Adicionar Produtos
                    2. Remover Produtos
                    3. Exibir Produtos
                    4. Exibir Valor total do Estoque
                    0. Sair
                    Escolha uma opção:
                    """;
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcao) {
                case 1 -> {
                    String nome = JOptionPane.showInputDialog("Nome do Produto:");
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do Produto:"));
                    int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade em Estoque:"));
                    String fornecedor = JOptionPane.showInputDialog("Fornecedor:");

                    Produto produto = new Produto(nome, preco, quantidade, fornecedor);
                    estoque.adicionarProduto(produto);
                    JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
                }
                case 2 -> {
                    String nome = JOptionPane.showInputDialog("Nome do Produto a ser removido:");
                    if (estoque.removerProduto(nome)) {
                        JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto não encontrado!");
                    }
                }
                case 3 -> JOptionPane.showMessageDialog(null, estoque.exibirProdutos());
                case 4 -> JOptionPane.showMessageDialog(null, "Valor total do estoque: " + estoque.calcularValorTotalEstoque());
                case 0 -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (opcao != 0);
    }
}
