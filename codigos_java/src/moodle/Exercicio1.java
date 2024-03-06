package moodle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma string: ");
		String input = sc.nextLine();

		// a)
		int numCaracteres = input.length();
		System.out.println("a) Numero de caracteres: " + numCaracteres);

		// b)
		String maiusculo = input.toUpperCase();
		System.out.println("b) String em maiusculo: " + maiusculo);

		// c)
		int numVogais = contarVogais(input);
		System.out.println("c) Numero de vogais: " + numVogais);

		// d)
		boolean comecaUNI = input.toUpperCase().startsWith("UNI");
		System.out.println("d) Come�a com UNI: " + comecaUNI);

		// e)
		boolean terminaRIO = input.toUpperCase().endsWith("RIO");
		System.out.println("e) Termina com RIO: " + terminaRIO);

		// f)
		int numDigitos = contarDigitos(input);
		System.out.println("f) Numero de digitos na string: " + numDigitos);

		// g)
		boolean palindromo = verificarPalindromo(input);
		System.out.println("g) � um palindromo: " + palindromo);

		sc.close();

	}

	//palindromo
	private static boolean verificarPalindromo(String str) {
		// TODO Auto-generated method stub
		 str = str.toLowerCase(); // Converter a string para min�sculas para ignorar mai�sculas/min�sculas
	        int left = 0;
	        int right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	}

	//contar digitos
	public static int contarDigitos(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	//contar vogais
	public static int contarVogais(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			char ch = str.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}
}
