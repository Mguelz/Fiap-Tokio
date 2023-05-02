package fiap_tokio.aulas.aula10;

import java.util.Scanner;

/**
 * 
 * Metodos com argumentos sem retornos
 * 
 * @author Miguel
 *
 */
public class MetodosComArgumento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.print("Digite seu nome: ");
		int idade = scanner.nextInt();

		saudacaoComParam(nome, idade);

		scanner.close();
	}

	
	static void saudacaoComParam(String nome, int idade) {

		if (idade >= 18) {
			System.out.printf("Oi %s!, voce tem %d anos e eh maior de idade\n", nome, idade);
		} else {
			System.out.printf("Oi %s!, voce tem %d anos e eh menor de idade ", nome , idade);
		}
	}

}
