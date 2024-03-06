package lista_4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        double[] atletas = new double[tamanho];

        for(int i = 0; i < tamanho; i++){
        System.out.println("Digite a altura do atleta: ");
        double altura = sc.nextDouble();
        atletas[i] = altura;
        }

        double soma = 0;
        for(int i = 0; i < tamanho; i++){
           soma += atletas[i];
        }

        double media = soma/tamanho;
        System.out.println("Media das alturas: " + media);
        System.out.println("------------------------------");

        for(int i = 0; i < tamanho; i++){
            if(atletas[i] > media){
                System.out.println("Atleta " + (i+1) + ": " + atletas[i]);
            }
        }
        sc.close();
    }
}
