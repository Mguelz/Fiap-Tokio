package fiap_tokio.aulas.exerc_aula05;

import java.util.Scanner;

/**
 * 
 * Neste problema, deve-se ler o nome de uma peça que chamaremos de peça1, o
 * número de peças1 que o usuário quer, o valor unitário de cada peça1, o nome
 * de uma peça2, o número de peças2 e o valor unitário de cada peça2. Após,
 * calcule e mostre o valor a ser pago.
 * 
 * @author logonrmlocal
 *
 */
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int peca1 = 0, peca2;
		double valorUnitarioPeca1 = 0, valorUnitarioPeca2 = 0;

		System.out.println("Peça 1");
		System.out.print("Digite o numero de pecas que voce deseja: ");
		peca1 = scanner.nextInt();
		for (int i = 0; i < peca1; i++) {
			System.out.print("Digite o valor unitario da peça " + (i + 1) + ": ");
			valorUnitarioPeca1 += scanner.nextInt();
		}

		System.out.println("Peça 2");
		System.out.print("Digite o numero de pecas que voce deseja: ");
		peca2 = scanner.nextInt();
		for (int i = 0; i < peca2; i++) {
			System.out.print("Digite o valor unitario da peça " + (i + 1) + ": ");
			valorUnitarioPeca2 += scanner.nextInt();
		}

		double valorTotal = valorUnitarioPeca1 + valorUnitarioPeca2;

		System.out.println("Valor total a ser pago: " + valorTotal);

		scanner.close();
	}

}
