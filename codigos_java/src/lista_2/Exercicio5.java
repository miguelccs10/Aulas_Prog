package lista_2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Digite um n�mero: ");
	        double numero = sc.nextDouble();
	        
	        if (numero >= 0) {
	            double raizQuadrada = Math.sqrt(numero);
	            System.out.println("A raiz quadrada do n�mero �: " + raizQuadrada);
	        } else {
	            double quadrado = numero * numero;
	            System.out.println("O quadrado do n�mero �: " + quadrado);
	        }
	        
	        sc.close();
		
	}

}
