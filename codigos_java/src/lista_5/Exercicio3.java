package lista_5;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int tamanho = 20;
		int[] V = new int[tamanho];
		int contNum = 0;

		for (int i = 0; i < tamanho; i++) {
			V[i] = random.nextInt(500);
		}

		for (int i = 0; i < tamanho; i++) {
			if (V[i] > 100)
				contNum++;
		}

		System.out.print("Vetor Gerado: ");

		for (int i = 0; i < tamanho; i++) {
			System.out.print(V[i] + " ");
		}

		System.out.println();
		System.out.print("Quantidade de nums > 100: " + contNum);
	}

}
