package fiap_tokio.exercicios.aula09;

import java.util.Random;

/**
 * 
 * Crie um programa com uma matriz 3x4 ▪ 3 linhas ▪ 4 colunas
 * 
 * ▪ Atribua valores aleatórios à todas posições da matriz. ▪ Exiba essa matriz.
 * 
 * @author Miguel
 *
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Random random = new Random();

		int linha = 3, coluna = 4;
		int[][] matriz = new int[linha][coluna];

		System.out.println("As posições terão que ser populadas de 0 à 100\n");

		// populando os index da matriz
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				matriz[i][j] = random.nextInt(0, 101);
			}
		}

		// imprimindo formatado 3x4
		System.out.println("      Tabela " + linha + " x " + coluna + "\n");
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
		
		
		
	}

}
