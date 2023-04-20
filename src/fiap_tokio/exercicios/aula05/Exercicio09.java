package fiap_tokio.exercicios.aula05;

import java.util.Scanner;

/**
 * Elabore um programa no qual o usuário entre com um número. ▪ Após isso seu
 * script deverá exibir o número digitado e sua respectiva separação em centena,
 * dezena e unidade. ▪ Exemplo: se o usuário digitar o número 729, deverá ser
 * exibido na tela: ▪ Centena = 700 ▪ Dezena = 20 ▪ Unidade = 9
 * 
 * ▪ Obs.: considere que o usuário irá digitar números somente até 999.
 * 
 * 
 * @author logonrmlocal
 *
 */
public class Exercicio09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numeroDigitado;
		int centena, dezena, unidade = 0;
		System.out.print("Digite um numero: ");
		numeroDigitado = scanner.nextInt();

		centena = numeroDigitado / 100; // pega a centena, ou seja, ignora os dois ultimos numeros
		dezena = (numeroDigitado % 100) / 10; // pega somente o penultimo numero digitado
		unidade = (numeroDigitado % 100) % 10; // pega somente o ultimo numero digitado

		System.out.println("\nO numero digitado foi: " + numeroDigitado);
		System.out.println("\nCentena: " + centena + "00");
		System.out.println("Dezena: " + dezena + "0");
		System.out.println("Unidade: " + unidade);

		scanner.close();

	}
}
