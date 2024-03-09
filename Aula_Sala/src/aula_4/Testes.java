package aula_4;

public class Testes {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(Aluno.formatNome("miguel"), "masculino", Aluno.idadeAleatoria());
        Aluno aluno2 = new Aluno(Aluno.formatNome("pedro"), "masculino", Aluno.idadeAleatoria());

        System.out.println("####################");
        System.out.println("Aluno 1: " + aluno1.nome);
        System.out.println("Genero: " + aluno1.genero);
        System.out.println("Idade: " + aluno1.idade);
        System.out.println("####################\n");

        System.out.println("####################");
        System.out.println("Aluno 2: " + aluno2.nome);
        System.out.println("Genero: " + aluno2.genero);
        System.out.println("Idade: " + aluno2.idade);
        System.out.println("####################");
    }
}
