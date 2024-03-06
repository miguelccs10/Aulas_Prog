package lista_4;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        palavra = palavra.replaceAll("\\s", "").toLowerCase();

        StringBuilder palavraInvertida = new StringBuilder(palavra);
        palavraInvertida.reverse();

        if(palavra.equals(palavraInvertida.toString())){
            System.out.println("A palavra é um anagrama");
            System.out.println("-------------------------");
            System.out.println(palavra + " ~ " + palavraInvertida);
            System.out.println("-------------------------");
        } else {
            System.out.println("A palavra nao é um anagrama");
        }
        sc.close();
    }
}
