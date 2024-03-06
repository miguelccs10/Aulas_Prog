
package lista_1;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		int A = scanner.nextInt();
		
		System.out.print("Digite o valor B: ");
		int B = scanner.nextInt();
		
		System.out.println("Valores antes da troca: ");
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		
		//Troca dos valores de A e B
		int temp = A;
		A = B;
		B = temp;
		
		System.out.println("Valores depois da troca: ");
		System.out.println("A: " + A);
		System.out.println("B: " + B);
		
		scanner.close();
		
		
	}

}
