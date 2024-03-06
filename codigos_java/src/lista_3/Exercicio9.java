package lista_3;
import java.util.Scanner;

public class Exercicio9 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);

    int maior = 0;
    int segundomaior = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um numero: ");
      int num = sc.nextInt();

      if (num <= 0) {
        System.out.print("Por favor, digite um numero positivo!");
        i--;
        continue;
      }
      if (num > maior) {
        segundomaior = maior;
        maior = num;
      } else if (num > segundomaior && num != maior) {
        segundomaior = num;
      }
    }
    sc.close();

    System.out.println("O maior numero: " + maior);
    System.out.println("O segundo maior numero: " + segundomaior);
  }
}
