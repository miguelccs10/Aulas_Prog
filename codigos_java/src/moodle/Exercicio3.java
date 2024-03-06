package moodle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Solicitar ao usu�rio um nome
		System.out.print("Digite um nome: ");
		String nome = scanner.nextLine();

		// Dividir o nome em palavras
		String[] palavras = nome.split(" ");

		// Iniciais a serem ignoradas
		String[] iniciaisIgnoradas = { "e", "do", "da", "dos", "das", "de", "di", "du" };

		// Inicializar uma string para armazenar as iniciais
		StringBuilder iniciais = new StringBuilder();

		// Iterar sobre as palavras do nome
		for (String palavra : palavras) {
			String palavraMinuscula = palavra.toLowerCase(); // Converter para min�sculas para verifica��o
			boolean ignorar = false;

			// Verificar se a palavra � uma inicial ignorada
			for (String inicial : iniciaisIgnoradas) {
				if (palavraMinuscula.equals(inicial)) {
					ignorar = true;
					break;
				}
			}

			// Se a palavra n�o for uma inicial ignorada, adicionar a inicial ao resultado
			if (!ignorar) {
				char inicial = Character.toUpperCase(palavra.charAt(0));
				iniciais.append(inicial);
			}
		}

		// Imprimir as iniciais em mai�sculas
		System.out.println("Iniciais: " + iniciais.toString());

		scanner.close();

	}

}
