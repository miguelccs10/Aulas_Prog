package lista_3;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 10 numeros");
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "º num: ");
			int numero = sc.nextInt();

			int cubo = (int) Math.pow(numero, 3);

			System.out.println("O cubo de " + numero + " é: " + cubo);

		}

		sc.close();
	}

}
