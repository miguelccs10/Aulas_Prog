package lista_2;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero A: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite um numero B: ");
		int num2 = sc.nextInt();
		
		int resul = num1 % num2;
		
		if (resul == 0)
			System.out.println("A � divisivel por B");
		else System.out.println("O numero A nao � divisel por B");
		
		sc.close();
	}

}
