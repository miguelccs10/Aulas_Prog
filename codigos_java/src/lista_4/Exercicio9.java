package lista_4;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = 3;
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um numero: ");
            double num = sc.nextDouble();

            if(num < 0){
                vetor[i] = -1;
            } else
                vetor[i] = Math.sqrt(num);
        }
        System.out.println("Valores armazenados no vetor: ");
        
        for(int i = 0; i < tamanho; i++){
            System.out.println("Posiçao[" + (i+1) + "] = " + vetor[i]);
        }
        sc.close();
    }
}
