package fiap_tokio.exercicios.aula10;

import java.util.Scanner;

/**
 * 
 * ▪ Faça um programa, com um método que necessite de três argumentos: ▪ dois
 * números e um sinal de operador matemático (+, -, * ou /). ▪ Ela deve fazer o
 * cálculo indicado pelo operador usando os dois número passados.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		char digitado;
		
		//TODO esta dando erro ao ler o char
		System.out.print("digite o primeiro numero inteiro: ");
		num1 = scanner.nextInt();
		System.out.print("digite a operacao: ");
		digitado = scanner.nextLine().charAt(0);
		System.out.print("digite o segundo numero inteiro: ");
		num2 = scanner.nextInt();

		operacao(num1, num2, digitado);

		scanner.close();
	}

	public static char operacao(int a, int b, char digitado) {
		switch (digitado) {
		case '+': {
			return '+';
		}
		case '-': {
			return '-';
		}
		case '/': {
			return '/';
		}
		case '*': {
			return '*';
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}

	public int soma(int a, int b) {
		return a + b;
	}

	public int subtracao(int a, int b) {
		return a - b;
	}

	public int divisao(int a, int b) {
		return a / b;
	}

	public int mulfiplicacao(int a, int b) {
		return a * b;
	}
	
}
