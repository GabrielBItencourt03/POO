package atividade04;
//Exercício 4: Produto Industrial
//Desenvolva uma classe Produto que represente um item fabricado. Deve conter
//atributos para código, nome, peso e preço de custo. Crie métodos para calcular o preço
//de venda (acréscimo de 30% sobre o custo) e exibir as especificações do produto.

public class Produto {
    private String codigo;
    private String nome;
    private double peso;
    private double precodeCusto;
    private double precoDeVenda;

    public void calcularPrecoDevenda(){
      precoDeVenda = precodeCusto * 1.3;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", peso=" + peso +
                ", precodeCusto=" + precodeCusto +
                ", precoDeVenda=" + precoDeVenda +
                '}';
    }
}
