package lista_2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num1 = sc.nextInt();
		
		if (num1 >= 20)
			System.out.print(num1);
		
		else System.out.print("Digite um numero maior !");
		
		sc.close();
	}

}
