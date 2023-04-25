package fiap_tokio.exercicios.aula07;

import java.util.Scanner;

/**
 * 
 * Determine e mostre todos os números primos no intervalo de 2 a 2000.
 * 
 * Dicas: ▪ Para resolver esse problema, primeiro faça um algoritmo que verifica
 * se um número inteiro qualquer é primo ou não. ▪ A seguir, com esse código em
 * mãos, faça os ajustes necessários para mostrar todos os números primos no
 * intervalo solicitado. ▪ Você precisará colocar uma estrutura de repetição
 * dentro da outra. ▪ Laços aninhados!!!!
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio10Desafio {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		

		// depois completa essa parte
//		System.out.println("calcular se um numero é primo no intervalo de 2 a 2000");
//		for (int i = 2; i < 2000; i++) {
//
//			for (int j = 2; j < 17; j++) {
//				if ((i % j <= j) && i % j != 0) {
//					primo = true;
//				}
//			}
//
//			if (primo) {
//				System.out.println("O numero " + i + " é um numero primo");
//			}
//		}

		scanner.close();

	}

	
	public boolean primo() {
		boolean primo = false;
		int qtd = 0;

		System.out.println("Digite um numero primo");
		int num = scanner .nextInt();

		for (int i = 1; i <= num; i++) { // somente resto por 1 e por ele mesmo tem que dar 0
			if (num % i == (int) 0) {
				qtd++;
			}
		}

		if (qtd == 2) {
			primo = true;
		}

		if (primo) {
			System.out.println("O numero " + num + " eh um numero primo");
		}
		return primo;
	}
}
