package fiap_tokio.exercicios.aula08;

import java.util.Random;

/**
 * Faça um programa que sorteio 100 números inteiros entre 0 e 100 (incluindo
 * 100). ▪ Ao final, exiba as seguintes informações: ▪ Foram sorteados XX
 * números pares. ▪ Foram sorteados XX números ímpares. ▪ Foram sorteados XX
 * números primos.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio06 {

	public static void main(String[] args) {
		Random random = new Random();

		int sorteio = 0, par = 0, impar = 0, primo = 0;

		for (int i = 0; i < 100; i++) {
			sorteio = random.nextInt(0, 101);

			// encontrar numeros pares
			if (sorteio % 2 == 0) {
				par++;
			}

			// encontrar numeros impares
			if (sorteio % 2 == 1) {
				impar++;
			}

			// encontrar numeros primos
			boolean ehPrimo = false;
			int qtd = 0;

			for (int j = 1; j <= sorteio; j++) { // somente resto por 1 e por ele mesmo tem que dar 0
				if (sorteio % j == 0) {
					qtd++;
				}
			}

			if (qtd == 2) {
				ehPrimo = true;
			}

			if (ehPrimo) {
				primo++;
			}

		} // primeiro for

		System.out.println("Foram sorteados " + par + " números pares.");
		System.out.println("Foram sorteados " + impar + " números impares.");
		System.out.println("Foram sorteados " + primo + " números primos.");

	} // main

}
