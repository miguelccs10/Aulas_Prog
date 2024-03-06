package lista_4;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] gabarito = {'A', 'B', 'C', 'B', 'A', 'C', 'A', 'B', 'C', 'C', 'A', 'B', 'A'};
        char[] resposta = new char[13];

        System.out.println("Digite o numero do apostador: ");
        int numApostador = sc.nextInt();

        System.out.println("Digite as apostas: ");
        for(int i =  0; i < 13; i++){
            System.out.print("Resposta " + (i+1) + ": ");
            resposta[i] = sc.next().charAt(0);
        }

        int acertos = contAcertos(gabarito, resposta);
        System.out.println("Apostador " + numApostador + " teve " + acertos + " acertos.");
        if (acertos == 13) {
            System.out.println("GANHADOR, PARABEENS!!!");
        }
        sc.close();
    }
    public static int contAcertos(char[] gabarito, char[] resposta){
        int acertos = 0;
        for(int i = 0; i < gabarito.length; i++){
            if (gabarito[i] == resposta[i]) {
                acertos++;
            }
        }
        return acertos;
    }
}
