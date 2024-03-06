package lista_1;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a temperatura em C°: ");
        int celsius = sc.nextInt();

        sc.close();

        int fahrenheit = (9* celsius + 160)/5;
        System.out.print("Temperatura em Fahrenheit: " + fahrenheit);
    }
}
