package lista_2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int numero = sc.nextInt();
		
		if (numero % 3 == 0)
			System.out.println("O numero � multiplo de 3 !");
		else System.out.println("O numero nao � multiplo de 3 !");
		
		sc.close();
		
	}

}
