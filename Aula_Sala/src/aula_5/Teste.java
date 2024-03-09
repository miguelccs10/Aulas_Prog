package aula_5;

public class Teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz", 123, 5.0, 10);
        Produto p2 = new Produto("Leite", 456, 4.0, 5);

        System.out.println("Antes da Alteraçao: ");
        System.out.println(p1 + "\n");
        System.out.println(p2);
        System.out.println("#####################\n");
        
        p1.addEstoque(10);
        p2.removeEstoque(3);
        
        System.out.println("Depois da Alteraçao: ");
        System.out.println(p1 + "\n");
        System.out.println(p2);
    }
}