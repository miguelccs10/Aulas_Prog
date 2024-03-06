package lista_2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite o segundo numero:");
		int num2 = sc.nextInt();
		
		int soma = num1 + num2;
		
		if (soma >= 10)
			System.out.println("O resultado �: " + soma);
		else System.out.println("A soma tem resultado menor que 10 !");
		
		sc.close();
		
	}

}
