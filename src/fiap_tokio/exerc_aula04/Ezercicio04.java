package fiap_tokio.exerc_aula04;

import java.util.Scanner;

/**
 * 
 * Exibir o nome e a idade
 * 
 * @author Miguel
 *
 */
public class Ezercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();

		System.out.println("Olá " + nome + ", você tem " + idade + " anos");

		scanner.close();
	}
}
