package fiap_tokio.exercicios.aula06;

import java.util.Scanner;

/**
 * 
 * Escreva um algoritmo que recebe dois números e um caractere (representando
 * uma das operações matemáticas (+, -, *, /) ▪ O programa deve calcular o valor
 * final de acordo com a operação selecionada. ▪ Ou seja, se a entrada for 5, 6
 * e *, então seu programa dever mostrar 30.
 * 
 * ▪ Dica: switch/case facilita as coisas.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2, resultado = 0;
		char operador;

		System.out.print("Digite um numero inteiro: ");
		num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Digite um operador para fazer a operacao: ");
		operador = scanner.nextLine().charAt(0);

		System.out.print("Digite outro numero inteiro; ");
		num2 = scanner.nextInt();

		switch (operador) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			resultado = num1 / num2;
			break;
		default:
			System.err.println("Voce digitou algum valor inválido");
		}

		System.out.println("");
		System.out.println("o resultado de " + num1 + " " + operador + " " + num2 + " resulta em = " + resultado);

		scanner.close();

	}

}
