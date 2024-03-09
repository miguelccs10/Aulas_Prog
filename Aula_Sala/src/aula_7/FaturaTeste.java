package aula_7;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura("123", "Teclado", 1, 48.0);
        Fatura fatura2 = new Fatura("321", "Mouse", 1, 50.0);
        
        System.out.println("#####################");
        System.out.println(fatura1 + "\n");
        System.out.println(fatura2);
        System.out.println("#####################\n");

    }
}
