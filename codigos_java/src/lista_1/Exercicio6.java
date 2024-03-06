package lista_1;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primera nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a segunda: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Digite a terceira: ");
		double nota3 = scanner.nextDouble();
		
		double notaFn = (nota1 + nota2 + nota3) / 10;
		System.out.print("Nota Final: " + notaFn);
		
		scanner.close();
		
	}

}
