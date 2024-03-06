package lista_2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num1 = sc.nextInt();
		
		if (num1 % 2 == 0)
			System.out.print("O numero � PAR");
		else System.out.print("O numero � IMPAR");
		
		sc.close();
	}

}
