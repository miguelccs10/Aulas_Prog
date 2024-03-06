package lista_2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = sc.nextInt();
		
		if (numero % 5 == 0)
			System.out.println("O numero � divisivel por 5 !");
		else System.out.println("O numero nao � divisivel 5 !");
		
		sc.close();
	}

}
