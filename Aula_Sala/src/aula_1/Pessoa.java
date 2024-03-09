package aula_1;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void VerificarIdade() {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " não é maior de idade");
        }
    }

    public void VerificarAltura() {
        if (altura >= 1.5) {
            System.out.println(nome + " é maior que 1.5m");
        } else {
            System.out.println(nome + " é menor que 1.5m");
        }
    }
}