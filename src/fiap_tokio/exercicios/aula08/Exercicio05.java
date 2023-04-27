package fiap_tokio.exercicios.aula08;

import java.util.Random;

/**
 * 
 * Faça um programa que sorteie 10 números aleatórios entre 5 e 50. ▪ Some todos
 * esses números e exiba o resultado final.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Random rand = new Random();
		int soma = 0;
		int aleatorio = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "º num - ");
			System.out.println(aleatorio = rand.nextInt(5, 51)); // sorteia numeros entre 5 e 50 (exclui o 51)
			soma += aleatorio;
		}

		System.out.println("A soma de todos os numeros eh: " + soma);
	}

}
