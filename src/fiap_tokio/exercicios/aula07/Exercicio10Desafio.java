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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean primo = false;

		System.out.println("calcular se um numero é primo no intervalo de 2 a 2000");
		for (int i = 2; i < 2000; i++) {
			if (i % 1 == 0 && i % i == 0) {
				primo = true;
			}
			if (primo) {
				System.out.println("O numero " + i + " é um numero primo");
			}
		}

		scanner.close();

	}

}
