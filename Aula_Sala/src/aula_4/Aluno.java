package aula_4;

import java.util.Random;

/* [ ] Crie uma classe Aluno com os atributos: nome, genero e idade
[ ] Crie uma classe de testes, contendo o método main, crie dois objetos da classe Aluno e exiba no console o nome de cada um deles
[ ] Crie um método estático que gere a idade do aluno de forma aleatória, no intervalo de 20 a 60 anos
[ ] Crie um método estático que formate o nome do aluno, colocando o nome em letras maiúsculas*/

public class Aluno {
    String nome;
    String genero;
    int idade;

    public Aluno(String nome, String genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
    }

    public static int idadeAleatoria() {
        Random rd = new Random();
        return rd.nextInt(41) + 20;
    }

    public static String formatNome(String nome){
        return nome.toUpperCase();
    }
}
