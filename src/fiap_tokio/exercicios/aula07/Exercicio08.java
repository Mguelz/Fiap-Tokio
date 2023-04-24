package fiap_tokio.exercicios.aula07;

import java.util.Scanner;

/**
 * Escreva um programa que dado um inteiro n positivo calcula e imprime a soma
 * de todos os números inteiros entre 1 e n. ▪ Valide a entrada do usuário, só
 * aceite números positivos!!
 * 
 * ▪ Dica: use do/while para a validação e for para a soma.
 * 
 * ▪ Por exemplo, se n = 10 então deverá ser calculado: ▪ 1 + 2 + 3 + 4 + 5 + 6
 * + 7 + 8 + 9 + 10 = 55 ▪ E a impressão final seria: ▪ A soma de 1 até 10 é: 55
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num, somaFinal = 0;
		boolean continuar = false;

		do {
			System.out.println("Digite um numero positivo");
			num = scanner.nextInt();

			// somando todos os numeros até chegar ao numero digitado
			for (int i = 0; i < num + 1; i++) {
				somaFinal += i;
			}
			
			if (num < 0) {
				System.out.println("Digite novamente, desta vez um numero positivo");
				continuar = true;
			}

			System.out.println("A soma de 1 até " + num + " é: " + somaFinal);

		} while (continuar);

		scanner.close();
	}
}
