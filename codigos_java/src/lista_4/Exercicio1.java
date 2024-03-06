package lista_4;


import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();

		int[] V = new int[40];
		
		for(int i = 0; i < 40; i++) {
			V[i] = random.nextInt(100) + 1;
		}

		int contPar = 0;

		for (int i = 0; i < 40; i++) {
			if (V[i] % 2 == 0)
			contPar++;
		}

		System.out.print("Vetor Gerado: ");
		for(int i = 0; i < 40; i++) {
			System.out.print(V[i] + " ");
		}
		System.out.println();
		System.out.print("Numeros pares: " + contPar);
	}

}
