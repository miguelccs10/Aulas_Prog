package lista_1;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do Salario: ");
        double sb = sc.nextDouble();

        double pd = (10/100) * sb;

        sc.close();
        System.out.print("Salario Liquido: " + pd);
    }
}
