package lista_1;


import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o raio: ");
		double raio = scanner.nextDouble();
		
		//calculo
		double form = (raio * raio) * 3.14159;
		
		System.out.print("Area = " + form);
		
		scanner.close();
		
	}

}
