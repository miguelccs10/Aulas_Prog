package lista_3;
import java.util.Scanner;

public class Exercicio10 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o menor numero: ");
    int limInferior = sc.nextInt();

    System.out.print("Agora o maior: ");
    int limSuperior = sc.nextInt();

    int somaPares = 0;

    System.out.println("Numeros pares no intervalo: ");
    for(int i = limInferior; i<= limSuperior; i++){
        if (i % 2 == 0){
            System.out.print(i + " ");
            somaPares += i;
        }
    }
    System.out.println ("Somatorio dos numeros pares: " + somaPares);
    sc.close();
  }
}
