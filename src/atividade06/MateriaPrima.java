package atividade06;
//Exercício 6: Estoque de Matéria-Prima
//Desenvolva uma classe MateriaPrima com atributos para nome, quantidade em
//estoque e fornecedor. Crie métodos para adicionar ao estoque, retirar do estoque e
//verificar se precisa repor (quantidade abaixo de 100 unidades).

public class MateriaPrima {
    private String nome;
    private int quantidadeEstoque;
    private String fornecedor;

    // Construtor
    public MateriaPrima(String nome, int quantidadeEstoque, String fornecedor) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.fornecedor = fornecedor;
    }

    // Método para adicionar ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }

    // Método para retirar do estoque
    public void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades retiradas do estoque.");
        } else {
            System.out.println("Quantidade inválida ou insuficiente no estoque.");
        }
    }

    // Método para verificar se precisa repor
    public boolean precisaRepor() {
        return this.quantidadeEstoque < 100;
    }

    // Método para exibir o estado atual
    public void exibirInformacoes() {
        System.out.println("Matéria-Prima: " + nome);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
        System.out.println("Fornecedor: " + fornecedor);
        System.out.println("Precisa repor? " + (precisaRepor() ? "Sim" : "Não"));
    }
}
