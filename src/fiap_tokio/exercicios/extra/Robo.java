package fiap_tokio.exercicios.extra;

import java.util.Scanner;

/**
 * 5. Um robô de combate só deve ativar sua arma principal quando o inimigo está
 * a menos de 70cm de distância. Faça um programa onde o usuário informe a
 * distância do inimigo e sejam exibidas as mensagens “ATIVADO” ou “DESATIVADO”
 * dependendo do status da arma.
 * 
 * @author Miguel
 */
public class Robo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double distanciaDoinimigo;

		System.out.println("--------------------- Desvio Condicional Extra ---------------------");
		System.out.println("Qual a distancia do inimigo?");
		distanciaDoinimigo = scanner.nextDouble();

		if (distanciaDoinimigo < 70.01 && distanciaDoinimigo > -69.99) {
			System.out.println("\nATIVADO");
			System.out.println("\" ra-ta-ta-ta-ta \"");
		} else {
			System.out.println("DESATIVADO");
		}

		scanner.close();
	}

}
