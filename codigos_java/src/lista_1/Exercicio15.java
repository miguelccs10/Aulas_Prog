package lista_1;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Qual a temperatura em F°: ");
        int fahrenheit = sc.nextInt();

        sc.close();

        int celsius= (fahrenheit-32)*(5/9);
        System.out.print("Temperatura em Celsius: " + celsius);
    }
}
