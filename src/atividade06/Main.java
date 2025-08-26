package atividade06;

public class Main {
    public static void main(String[] args) {
        MateriaPrima ferro = new MateriaPrima("Ferro", 80, "Fornecedor ABC");

        ferro.exibirInformacoes();

        ferro.adicionarEstoque(50);
        ferro.exibirInformacoes();

        ferro.retirarEstoque(20);
        ferro.exibirInformacoes();

        ferro.retirarEstoque(200); // Estoque insuficiente
    }
}

