package fiap_tokio.exercicios.aula10;

import java.util.Scanner;

/**
 *
 * Escreva um método para conversão de temperatura. ▪ Ela deve receber 2
 * argumentos: ▪ um número ▪ um caractere 'C', 'F' ou 'K', indicando que a
 * temperatura está em Celsius, Fahrenheit ou Kelvin. ▪ A função deve exibir a
 * temperatura nas 3 escalas.
 * 
 * @author Miguel
 *
 */
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num = 0;
		char caractere;

		System.out.print("Digite um numero: ");
		num = Double.parseDouble(scanner.nextLine());
		System.out.print("Escolha uma temperatura --> C, F ou K: ");
		caractere = scanner.nextLine().toUpperCase().charAt(0);

		temperatura(num, caractere);

		scanner.close();
	}

	public static void temperatura(double num, char caractere) {
		double celcius = 0, fahrenheit = 0, kelvin = 0;
		switch (caractere) {
		case 'C':
			celcius = num;
			fahrenheit = celcius * 1.8 + 32; // C to F
			kelvin = celcius + 273.15; // C to K
			System.out.println("Tempreratura em Celcius - " + celcius);
			System.out.println("Tempreratura em Fahremheit - " + fahrenheit);
			System.out.println("Tempreratura em Kelvin - " + kelvin);
			break;
		case 'F':
			fahrenheit = num;
			celcius = (32 * fahrenheit - 32) * 5 / 9;
			celcius = (fahrenheit - 32) / 1.8; // F to C
			kelvin = celcius + 273.15; // C to K
			System.out.println("Tempreratura em Fahremheit - " + fahrenheit);
			System.out.println("Tempreratura em Celcius - " + celcius);
			System.out.println("Tempreratura em Kelvin - " + kelvin);
			break;
		case 'K':
			kelvin = num;
			celcius = kelvin - 273.15; // K to C
			fahrenheit = (celcius * 1.8) + 32; // K to F
			System.out.println("Tempreratura em kelvin - " + kelvin);
			System.out.println("Tempreratura em Celcius - " + celcius);
			System.out.println("Tempreratura em Fahremheit - " + fahrenheit);
			break;
		default:
			System.out.println("Voce nao digitou (C, F ou K)");
		}
	}

}
