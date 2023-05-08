package fiap_tokio.exercicios.aula11;

import java.util.Scanner;

/**
 * 
 * 
 * Escreva um método para conversão de temperatura. ▪ Ela deve receber 2
 * argumentos: ▪ um número ▪ um caractere 'C', 'F' ou 'K', indicando que a
 * temperatura está em Celsius, Fahrenheit ou Kelvin. ▪ O método deve exibir a
 * temperatura nas 3 escalas. ▪ Também deve perguntar qual valor deseja retornar
 * (Celsius, Fahrenheit ou Kelvin).
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num = 0;
		char caractere;
		char retornar = 0;

		System.out.print("Digite um numero: ");
		num = Double.parseDouble(scanner.nextLine());
		System.out.print("Escolha uma temperatura --> C, F ou K: ");
		caractere = scanner.nextLine().toUpperCase().charAt(0);
		System.out.print("Para qual temperatura voce quer converter - C, F ou K: ");
		retornar = scanner.nextLine().toUpperCase().charAt(0);

		System.out.println("\nTemperatura Anets: " + num);
		System.out.println("Temperatura Depois: " + temperatura(num, caractere, retornar));

		scanner.close();
	}

	/**
	 * recebe a temperatuar escolhida juntamente com o numero
	 * 
	 * @param num
	 * @param caractere
	 * @return double
	 */
	public static double temperatura(double num, char caractere, char retornar) {
		double celcius = 0, fahrenheit = 0, kelvin = 0;
		switch (caractere) {
		case 'C':
			celcius = num;
			fahrenheit = celcius * 1.8 + 32; // C to F
			kelvin = celcius + 273.15; // C to K
			if (retornar == 'C') {
				return celcius;
			} else if (retornar == 'F') {
				return fahrenheit;
			} else if (retornar == 'K') {
				return kelvin;
			}
			break;
		case 'F':
			fahrenheit = num;
			celcius = (32 * fahrenheit - 32) * 5 / 9;
			celcius = (fahrenheit - 32) / 1.8; // F to C
			kelvin = celcius + 273.15; // C to K
			if (retornar == 'C') {
				return celcius;
			} else if (retornar == 'F') {
				return fahrenheit;
			} else if (retornar == 'K') {
				return kelvin;
			}
			break;
		case 'K':
			kelvin = num;
			celcius = kelvin - 273.15; // K to C
			fahrenheit = (celcius * 1.8) + 32; // K to F
			if (retornar == 'C') {
				return celcius;
			} else if (retornar == 'F') {
				return fahrenheit;
			} else if (retornar == 'K') {
				return kelvin;
			}
			break;
		default:
			System.out.println("Voce nao digitou (C, F ou K)");
		}
		return kelvin;
	}

}
