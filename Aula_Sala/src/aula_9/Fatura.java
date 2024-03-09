package aula_9;

public class Fatura {
    private String num;
    private String descricao;
    private int quantidadeItem;
    private Double preco;

    //constructors
    public Fatura(String num, String descricao, int quantidadeItem, Double preco) {
        this.num = num;
        this.descricao = descricao;
        this.quantidadeItem = quantidadeItem;
        this.preco = preco;
    }

    //getters
    public String getNum() {
        return num;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getQuantidadeItem() {
        return quantidadeItem;
    }
    public Double getPreco() {
        return preco;
    }

    //setters
    public void setNum(String num) {
        this.num = num;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }
    public void setPreco(Double preco) {
       if (preco > 0 ){
            this.preco = preco;
       } else{
            this.preco = 0.0;
       }
    }

    public Double getTotalFatura(){
        return quantidadeItem * preco;
    }

    public String toString(){
        return "Numero da Fatura: " + getNum() + "\n" +
               "Descriçao: " + getDescricao() + "\n" +
               "Quantidade: " + getQuantidadeItem() + "\n" +
               "Preço por Item: " + getPreco() + "\n" +
               "Total da Fatura: " + getTotalFatura() + "\n";
    }
}
