public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void VerificarIdade(){
        if(idade >= 18){
            System.out.println(nome + " é maior de idade");
        } else{
            System.out.println(nome + " não é maior de idade");
        }
    }

    public void VerificarAltura(){
        if(altura >= 1.5){
            System.out.println(nome + " é maior que 1.5m");
        } else{
            System.out.println(nome + " é menor que 1.5m");
        }
    }



public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Miguel", 19, 1.75);
    Pessoa pessoa2 = new Pessoa("Guilherme", 19, 1.74);
    Pessoa pessoa3 = new Pessoa("Jeanderson", 18, 1.93);
    
    System.out.println("####################");
    pessoa1.VerificarIdade();
    pessoa1.VerificarAltura();
    System.out.println("####################");
    System.out.println();
    System.out.println("####################");
    pessoa2.VerificarIdade();
    pessoa2.VerificarAltura();
    System.out.println("####################");
    System.out.println();
    System.out.println("####################");
    pessoa3.VerificarIdade();
    pessoa3.VerificarAltura();
    System.out.println("####################");
    }
}