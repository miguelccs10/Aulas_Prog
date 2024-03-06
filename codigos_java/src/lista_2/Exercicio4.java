package lista_2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1� num: ");
		int num1 = sc.nextInt();
		
		System.out.print("2� num: ");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		if (soma > 20)
			System.out.println(soma + 8);
		else System.out.print(soma - 5);
		
		sc.close();
		
	}

}
