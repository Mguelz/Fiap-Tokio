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

		System.out.print("digite o primeiro numero inteiro: ");
		num1 = Integer.parseInt(scanner.nextLine());
		System.out.print("digite a operacao: ");
		digitado = scanner.nextLine().charAt(0);
		System.out.print("digite o segundo numero inteiro: ");
		num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println(" ");
		
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
		int soma = a + b;
		System.out.println(a + " + " + b + " = " + soma);
		return soma;
	}

	/**
	 * subtrai dois numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int subtracao(int a, int b) {
		int subtracao = a - b;
		System.out.println(a + " - " + b + " = " + subtracao);
		return subtracao;
	}

	/**
	 * divide dois numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int divisao(int a, int b) {
		int divisao = a / b;
		System.out.println(a + " / " + b + " = " + divisao);
		return divisao;
	}

	/**
	 * multiplica dois numeros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int multiplicacao(int a, int b) {
		int multiplicacao = a * b;
		System.out.println(a + " * " + b + " = " + multiplicacao);
		return a * b;
	}

}
