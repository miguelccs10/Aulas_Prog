package lista_3;
import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);

    int contador = 0;

    for (int i = 1; i <= 15; i++) {
      System.out.print("Digite o " + " ° numero: ");
      int num = sc.nextInt();

      if (num > 30) {
        contador++;
      }
    }
    sc.close();

    System.out.println("Quantidade de numero maiores que 30: " + contador);
  }
}
