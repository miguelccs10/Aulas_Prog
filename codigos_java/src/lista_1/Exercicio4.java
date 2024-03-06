package lista_1;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade em anos: ");
		int anos = scanner.nextInt();
		
		System.out.print("Digite sua idade em meses: ");
		int meses = scanner.nextInt();
		
		System.out.print("Digite sua idade em dias: ");
		int dias = scanner.nextInt();
		
		int idadeEmDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("A idade em apenas em dias é: " + idadeEmDias + " dias");
		
		scanner.close();
	}

}
