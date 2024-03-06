package lista_4;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ola, digite a quantidade de participantes: ");
        int participantes = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[participantes];
        double[] notas = new double[participantes];

        for(int i = 0; i < participantes; i++) {
            System.out.println("Informe o nome do participante " + (i+1) + ": ");
            nomes[i] = sc.nextLine();

            System.out.println("Informe a pontuação de " + nomes[i] + ": ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println("Colocados com mais de 70 pontos: ");

        for (int i = 0; i < participantes; i++){
            if (notas[i] > 70) {
                System.out.println(nomes[i] + "- pontuação: " + notas[i]);
            }
        }
        sc.close();
    }
}
