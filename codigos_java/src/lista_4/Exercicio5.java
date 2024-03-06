package lista_4;

import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {

        Random random = new Random();

        int tamanho = 15;
        int[] v = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            v[i] = random.nextInt(901) + 100;
        }

        int maiorElemento = v[0];
        int posicaoMaior = 0;
        int menorElemento = v[0];
        int posicaoMenor = 0;

        for (int i = 1; i <tamanho; i++){
            if (v[i] > maiorElemento){
                maiorElemento = v[i];
                posicaoMaior = i + 1;
            }
            if (v[i] < menorElemento){
                menorElemento = v[i];
                posicaoMenor = i + 1;
            }
        }
        //a)
        System.out.println("Maior elemento: " + maiorElemento);
        System.out.println("Posiçao do maior elemento: " + posicaoMaior);

        //b)
        System.out.println("Menor elemento: " + menorElemento);
        System.out.println("Posiçao do menor elemento: " + posicaoMenor);

        // print vetor
        System.out.println("--------------------------");
        System.out.println("Vetor: ");
        for (int i = 0; i < tamanho; i++)
            System.out.print(v[i] + " ");
            System.out.println();
        System.out.println("--------------------------");
    }
}
