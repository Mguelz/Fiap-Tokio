package fiap_tokio.exercicios.aula09;

import java.util.Random;

/**
 * 
 * ▪ Escreva um algoritmo que recebe um número inteiro n > 0, cria um vetor de
 * números reais com n posições e preenche o vetor com n números aleatórios
 * reais. ▪ Depois de preenchido o vetor, imprima na tela todos os números
 * gerados.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio03 {

	public static void main(String[] args) {
		Random random = new Random();
		double n = random.nextInt(0, 6);

		if (n > 0) {
			Double[] vetor = new Double[(int)n];
			for (double i : vetor) {  // TODO esta dando erro aqui
				i = Math.random();
			}

			for (Double i : vetor) {
				System.out.println(i);
			}
		}

	}

}
