package lista_1;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tempo em segundos: ");
		int segundos = scanner.nextInt();
		
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segundosRestantes = segundos % 60;
		
		System.out.print("O tempo foi de: " + horas + " hrs " + minutos + " min " + segundosRestantes + "seg");
		
		scanner.close();
		
	}

}
