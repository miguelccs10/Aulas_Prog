package aula_10;

public class Animal {
    String nome;
    float comprimento;
    int numDePatas;
    String cor;
    String ambiente;
    float velocidadeMedia;

    public Animal(String nome, float comprimento, int numDePatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numDePatas = numDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public int getNumDePatas() {
        return numDePatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumDePatas(int numDePatas) {
        this.numDePatas = numDePatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public void verDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Numero de patas: " + numDePatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade Media: " + velocidadeMedia);
    }
}