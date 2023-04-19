package fiap_tokio.aulas.exerc_aula04;

import java.util.Scanner;

/**
 * 
 * Como printar o nome do usuario sem precisar guardar em uma variavel
 * 
 * @author Miguel
 *
 */
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu nome");
		System.out.println("Seu nome é: " + scanner.nextLine());

		scanner.close();
	}
}
