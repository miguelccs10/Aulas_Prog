package aula_7;

public class Produto {
    String nome;
    int codigo;
    double preco;
    int quantidadeEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void addEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void removeEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque){
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em Estoque");
        }
    }

    public double calcEstoque() {
        return quantidadeEstoque * preco;
    }

    public static String qualCategoria(int codigo){
        if(codigo > 100)
            return "Perecivel";
        else
            return "Nao perecivel";
    }

    public String toString(){
        return "Nome: " + nome + " (" + qualCategoria(codigo) + ")\n" +
               "Codigo: " + codigo + "\n" +
               "Preço: " + preco + "\n" +
               "Quantindade em Estoque: " + quantidadeEstoque + "\n" +
               "Valor Total em Estoque: " + calcEstoque() + "\n";
    }
}