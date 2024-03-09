package aula_1;

public class Main_Pessoa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Miguel", 19, 1.75);
        Pessoa pessoa2 = new Pessoa("Guilherme", 19, 1.74);
        Pessoa pessoa3 = new Pessoa("Jeanderson", 18, 1.93);

        System.out.println("####################");
        pessoa1.VerificarIdade();
        pessoa1.VerificarAltura();
        System.out.println("####################\n");
        
        System.out.println("####################");
        pessoa2.VerificarIdade();
        pessoa2.VerificarAltura();
        System.out.println("####################\n");
        
        System.out.println("####################");
        pessoa3.VerificarIdade();
        pessoa3.VerificarAltura();
        System.out.println("####################");
    }
}