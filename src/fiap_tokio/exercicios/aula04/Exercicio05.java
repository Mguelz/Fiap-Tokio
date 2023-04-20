package fiap_tokio.exercicios.aula04;

import java.util.Scanner;

/**
 * 
 * Exibir o salario
 * 
 * @author Miguel
 *
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu salario");
		double salario = scanner.nextDouble();

		System.out.println("Seu salário é: " + salario);

		scanner.close();
	}

}
