package lista_1;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a distancia em km: ");
		int km = scanner.nextInt();
		
		System.out.print("Qual a quantidade de combustivel: ");
		int gas = scanner.nextInt();
		
		int rendimento = km/gas;
		
		System.out.print("O rendimento foi de: " + rendimento + "km/L");
		
		scanner.close();
		
	}

}
