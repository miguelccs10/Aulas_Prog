package lista_4;

import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int tamanho = 500;
		int[] V = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			V[i] = random.nextInt(2001) + 1;
		}

		System.out.print("Vetor Gerado: ");

		for (int i = 0; i < tamanho; i++) {
			System.out.println(V[i] + " ");
		}
	}
}
