package lista_1;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		             //Valores das variaveis
		System.out.print("Digite o valor de A: ");
		int a = scanner.nextInt();
		
		System.out.print("Digite o valor de B: ");
		int b = scanner.nextInt();
		
		System.out.print("Digite o valor de C: ");
		int c = scanner.nextInt();
		
		System.out.print("Digite o valor de D: ");
		int d = scanner.nextInt();
		
		System.out.print("Digite o valor de E: ");
		int e = scanner.nextInt();
		
		System.out.print("Digite o valor de F: ");
		int f = scanner.nextInt();
		
		          //valores de x e y
		int x = (c*e) - (b*f)/(a*e) - (b*b);
		int y = (a*f) - (c*d)/(a*e) - (b*d);
		
		System.out.println("O valor de X: " + x);
		System.out.print("O valor de Y: " + y);
		
		scanner.close();
		
	}

}
