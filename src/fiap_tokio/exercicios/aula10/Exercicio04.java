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

		// TODO esta dando erro ao ler o char
		System.out.print("digite o primeiro numero inteiro: ");
		num1 = scanner.nextInt();
		System.out.print("digite a operacao: ");
		digitado = scanner.nextLine().charAt(0);
		System.out.print("digite o segundo numero inteiro: ");
		num2 = scanner.nextInt();

		operacao(num1, digitado, num2);

		scanner.close();
	}

	/**
	 * este método vai verificar qual o operador digitado pelo usuario e os numeros
	 * digitador pelo usuario
	 * 
	 * @param a
	 * @param b
	 * @param digitado
	 * @return
	 */
	public static int operacao(int a, char digitado, int b) {
		switch (digitado) {
		case '+': {
			return soma(a, b);
		}
		case '-': {
			return subtracao(a, b);
		}
		case '/': {
			return divisao(a, b);
		}
		case '*': {
			return multiplicacao(a, b);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
	}

	/**
	 * soma dois numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int soma(int a, int b) {
		return a + b;
	}

	/**
	 * subtrai dois numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int subtracao(int a, int b) {
		return a - b;
	}

	/**
	 * divide dois numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int divisao(int a, int b) {
		return a / b;
	}

	/**
	 * multiplica dois numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int multiplicacao(int a, int b) {
		return a * b;
	}

}
