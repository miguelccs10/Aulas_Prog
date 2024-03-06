package lista_1;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		int idadeEmDias = scanner.nextInt();
		
		int idadeEmMeses = idadeEmDias / 30;
		int idadeEmAnos = idadeEmMeses / 12;
		
		System.out.print("Sua idade é: " + idadeEmAnos + " anos.");
		
		scanner.close();
		
	}

}
