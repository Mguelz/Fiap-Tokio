package fiap_tokio.exercicios.aula08;

import java.util.Scanner;

/**
 * 
 * Faça um programa que recebe um texto qualquer do usuário. ▪ A seguir, exiba:
 * ▪ A quantidade de caracteres alfabéticos maiúsculos ▪ A quantidade de
 * caracteres alfabéticos minúsculos ▪ A quantidade de caracteres numéricos ▪ A
 * quantidade de espaço em branco
 * 
 * @author Miguel
 *
 */
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maiusculas = 0, minusculas = 0, numericos = 0, emBranco = 0;
		String digitado;

		System.out.print("Digite um texto qualquer: ");
		digitado = scanner.nextLine();

		for (int i = 0; i < digitado.length(); i++) {
			if ((digitado.charAt(i) >= 'A') && (digitado.charAt(i) <= 'Z')) {
				maiusculas++;
			}
			if ((digitado.charAt(i) >= 'a') && (digitado.charAt(i) <= 'z')) {
				minusculas++;
			}
			if ((digitado.charAt(i) >= '1') && (digitado.charAt(i) <= '9')) {
				numericos++;
			}
			if (digitado.charAt(i) < 0) { // TODO acertar a lógica
				emBranco++;
			}
		}

		System.out.println("Texto Digitado: " + digitado);
		System.out.println("Quantidade Maiúsculas: " + maiusculas);
		System.out.println("Quantidade Minúsculas: " + minusculas);
		System.out.println("Quantidade Numéricos: " + numericos);
		System.out.println("Quantidade Espaço em Branco: " + emBranco);

		scanner.close();

	}

}
