package fiap_tokio.exercicios.aula06;

import java.util.Scanner;

/**
 * 
 * 
 * Faça um programa que leia 2 valores inteiros (A e B). ▪ A seguir, o programa
 * deve mostrar uma mensagem "São Múltiplos" ou "Não são Múltiplos", indicando
 * se os valores lidos são múltiplos entre si.
 * 
 * Dica: ▪ Como que eu sei que 2 números são ou não são múltiplos um do outro? ▪
 * Conjunto dos Múltiplos de 2 = {2, 4, 6, 8, 10, ...} ▪ Então se observa que os
 * múltiplos de um número são divisíveis por esse número, então o resto dessa
 * divisão será 0.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2, verificarDivisao, verificarMultiplicacao;
		boolean resposta = false;

		System.out.print("Digite um numero: ");
		num1 = scanner.nextInt();
		System.out.print("Digite outro numero, agora para verificar se este é multiplo: ");
		num2 = scanner.nextInt();

		// tentativa sem loop
//		verificarDivisao = (int) num1 % num2;
//		verificarMultiplicacao = num1 * num2;

		// tentativa com for
//		for (int i = 0; i < 999; i++) {
//			verificarMultiplicacao = num1 * i;
//			if (num2 == i) {
//				resposta = true;
//			}
//		}

		// tentativa com while
		int i = 0;
		int j = 0;
		while (i <= num2) {
			i = (num1 * j);
			if (i == num2) {
				resposta = true;
			}
			j++;
		}

		if (resposta == true) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		scanner.close();

	}

}
