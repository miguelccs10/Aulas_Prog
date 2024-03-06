package lista_3;

import java.util.Scanner;

public class Exercicio8 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um numero: ");
    int num = sc.nextInt();
    int maior = Integer.MIN_VALUE;

    for (int i = 1; i <= num; i++) {
      System.out.println("Digite o " + i + "numero");
      int numero = sc.nextInt();

      if (numero > maior) {
        maior = numero;
      }
    }
    System.out.println("O maior numero: " + maior);
    sc.close();
  }
}
