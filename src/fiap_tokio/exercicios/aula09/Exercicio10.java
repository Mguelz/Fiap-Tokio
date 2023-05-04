package fiap_tokio.exercicios.aula09;

import java.util.Random;

/**
 * 
 * ▪ Faça um programa que realize a soma de duas matrizes, com mesmas dimensões.
 * Seu programa deve ter 2 matrizes A e B de números inteiros. A terceira matriz
 * deve ser a soma de A com B.
 * 
 * ▪ Exemplo de soma: -3 5 2 + 7 2 0 = 4 7 2 1 6 3 + 9 -2 3 = 10 4 7
 * 
 * @author Miguel
 *
 */
public class Exercicio10 {

	public static void main(String[] args) {

		Random random = new Random();

		int linha = 3, coluna = 3;

		int[][] matrizA = new int[linha][coluna];
		int[][] matrizB = new int[linha][coluna];

		// populando a matrizA
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matrizA[i][j] = random.nextInt(-10, 11);
			}
		}

		// populando a matrizB
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matrizB[i][j] = random.nextInt(-10, 11);
			}
		}

		System.out.println("--------------------------------------------------------");
		System.out.println("Imprimindo as matrizes");
		System.out.println("--------------------------------------------------------\n");

		// imprimindo matrizA
		System.out.println("        Matriz A");
		System.out.println("      Tabela " + linha + " x " + coluna + "\n");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(matrizA[i][j] + "\t");
			}
			System.out.println("");
		}

		// imprimindo matrizB
		System.out.println("\n        Matriz B");
		System.out.println("      Tabela " + linha + " x " + coluna + "\n");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(matrizB[i][j] + "\t");
			}
			System.out.println("");
		}

		System.out.println("\n--------------------------------------------------------");
		System.out.println("Imprimindo a soma das matrizes");
		System.out.println("--------------------------------------------------------");

		// TODO formatar a tabela para melhor visualização
		// somando as matrizes
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.print(matrizA[i][j] + matrizB[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
