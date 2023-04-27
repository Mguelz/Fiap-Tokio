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
		double n = random.nextInt(6) + 1; // sorteia numeros de 1 a 5

		if (n > 0) {
			double[] vetor = new double[(int) n];
			System.out.println("Voce criou um vetor double com: " + (int) n + " posicoes\n");

			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = random.nextDouble(10) + 1;
			}

//			for (double i : vetor) {  // TODO como adicionar valores aleatorios utilizando o for each?
//				i = Math.random();	  // TODO COMO FAZ ISSO???!!!
//			}

			for (Double j : vetor) {
				System.out.println(j);
			}

		}

	}

}
