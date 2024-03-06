package lista_4;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contespacos = 0;
        int contLetraA = 0;

        System.out.println("Digite uma frase com 80 caracteres: ");
        String frase = sc.nextLine();
        
        sc.close();

        if(frase.length() > 80){
            System.err.println("A frase excede o limite de 80 caracteres ! ");
            return;
        }
        
        for(int i = 0; i < frase.length(); i++){
            char caracteres = frase.charAt(i);

            if(caracteres == ' '){
                contespacos++;
            } else if (caracteres == 'A' || caracteres == 'a') {
                contLetraA++;
            }
        }
        System.out.println("Quantidade de espaços em branco: " + contespacos);
        System.out.println("Quantidade de letra 'A': " + contLetraA);
        sc.close();
    }
}
