package lista_1;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quiantidade de camisas P: ");
		int camisaPequena = scanner.nextInt();
		
		System.out.print("Digite a quantidade de camisas M: ");
		int camisaMedia = scanner.nextInt();
		
		System.out.print("Digite a quantidade de camisas G: ");
		int camisasGrandes = scanner.nextInt();
		
		double precopequena = 10;
		double precomedia = 12;
		double precogrande = 15;
		
		double valorTotal = (camisaPequena * precopequena) + (camisaMedia * precomedia) + (camisasGrandes * precogrande);
		
		if (valorTotal > 150 ) {
			double desconto = valorTotal * 0.10;
			valorTotal -= desconto;
		}
		
		System.out.print("O valor total a ser pago é: " + valorTotal);
		
		scanner.close();
	}

}
