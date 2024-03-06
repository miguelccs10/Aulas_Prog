package lista_4;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int tamanho = 20;

		int[] V1 = new int[tamanho];
		int[] V2 = new int[tamanho];

		for (int i = 0; i < 20; i++) {
			V1[i] = random.nextInt(101);
		}

		for (int i = 0; i < 20; i++) {
			V2[i] = random.nextInt(101);
		}

		int[] Vresul = new int[tamanho * 2];

		for (int i = 0; i < tamanho; i++) {
			Vresul[i * 2] = V1[i];
			Vresul[i * 2 + 1] = V2[i];
		}

		System.out.println("Vetor resultante: ");
		for (int i = 0; i < tamanho * 2; i++) {
			System.out.println("Posi��o " + i + ": " + Vresul[i]);
		}
	}

}
