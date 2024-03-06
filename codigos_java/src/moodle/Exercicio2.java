package moodle;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Solicitar ao usu�rio um valor num�rico
		System.out.print("Digite um valor num�rico: ");
		int numero = scanner.nextInt();

		// Verificar se o n�mero � negativo
		if (numero < 0) {
			System.out.println("N�mero negativo n�o � suportado.");
			scanner.close();
			return;
		}

		// Converte o n�mero para extenso
		String numeroPorExtenso = converterNumeroParaExtenso(numero);

		// Imprime cada d�gito por extenso
		System.out.println("Resultado: " + numeroPorExtenso);

		scanner.close();
	}

	// Fun��o para converter um n�mero em extenso
	public static String converterNumeroParaExtenso(int numero) {
		String[] unidades = { "", "um", "dois", "tr�s", "quatro", "cinco", "seis", "sete", "oito", "nove" };

		StringBuilder extenso = new StringBuilder();
		int divisor = 1;

		// Encontrar o divisor correto para separar os d�gitos
		while (numero / divisor >= 10) {
			divisor *= 10;
		}

		// Separar e converter cada d�gito por extenso
		while (divisor >= 1) {
			int digito = (numero / divisor) % 10;
			extenso.append(unidades[digito]);

			// Adicionar uma v�rgula, exceto para o �ltimo d�gito
			if (divisor > 1) {
				extenso.append(", ");
			}

			divisor /= 10;
		}

		return extenso.toString();

	}

}
