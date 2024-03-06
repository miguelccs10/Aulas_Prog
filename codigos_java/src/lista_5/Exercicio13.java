package lista_5;

import java.util.Random;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int [][] matriz1 = new int[3][3];
        int [][] matriz2 = new int[3][3];
        int [][] matrizMult = new int[3][3];
        int [][] matrizSoma = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matriz1[i][j] = random.nextInt(100) + 1;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3; j++){
                matriz2[i][j] = random.nextInt(100) + 1;
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrizMult[i][j] = matriz1[i][j] * matriz2[j][i];
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.print("1. Mostrar as duas matrizes \r\n" +
            "2. Multiplicar as duas matrizes e mostrar a matriz resultante \r\n" + 
            "3. Somar as duas matrizes e mostrar a matriz resultante \r\n" +
            "Escolha uma das opçoes: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("        *Matriz 1*         ");
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        System.out.print(" [" + matriz1[i][j] + "]");
                    }
                    System.out.println();
                }
                System.out.println("---------------------------------");
                System.out.println("         *Matriz 2*         ");
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        System.out.print(" [" + matriz2[i][j] + "]");
                    }
                    System.out.println();
                }
                System.out.println("---------------------------------");
                break;

            case 2:
                System.out.println("         *Matriz Mult*         ");
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        System.out.print(" [" + matrizMult[i][j] + "]");
                    }
                    System.out.println();
                }
                System.out.println("---------------------------------");
                break;

            case 3:
                System.out.println("         *Matriz Soma*         ");
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        System.out.print("[" + matrizSoma[i][j] + "]");
                    }
                    System.out.println();
                }
                System.out.println("---------------------------------");
                break;

            default:
                System.err.println("Opçao invalida !");
                break;
        }

        sc.close();

    }
}

