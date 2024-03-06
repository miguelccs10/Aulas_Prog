package lista_1;
import java.util.Scanner;

public class Excercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ola, digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Agora digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		String nomeCompleto = nome + " " + sobrenome;
		System.out.println("Nome completo: " + nomeCompleto);
		
		scanner.close();
	}

}
