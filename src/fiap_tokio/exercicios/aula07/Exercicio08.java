package fiap_tokio.exercicios.aula07;

import java.util.Scanner;

/**
 * 
 * Escreva um algoritmo que recebe um inteiro positivo n e imprime todos os
 * divisores positivos de n. ▪ Utilize o laço for.
 * 
 * ▪ Exemplo: Suponha que n = 28, nessa situação devemos imprimir os números 1,
 * 2, 4, 7, 14 e 28, que são todos os divisores do 28.
 * 
 * ▪ Dica: para o número ser divisor de n, a divisão precisa ter resto nulo.
 * 
 * @author Miguel
 *
 */
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;
		boolean continuar = false;

		do {
			System.out.println("Digite um numero inteiro");
			num = scanner.nextInt();

			for (int i = 1; i < num + 1; i++) {
				// verifica se o numero dividido por "i" é divisor (se essa operação resultar em 0, então imprime o numero indicando que ele é divisor)
				if (num % i == 0) {
					System.out.println("O numero " + i + " é divisor de " + num);
				}
			}

		} while (continuar);

		scanner.close();
	}

}
