package fiap_tokio.exercicios.aula08;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 * Faça um programa que verifica a hora do dia e exiba a mensagem ao usuário com
 * o nome dele: ▪ “Bom dia, FULANO!” se for maior ou igual que 6h da manhã ▪
 * “Boa tarde, FULANO!” se for maior ou igual que 12h ▪ “Boa noite, FULANO!” se
 * for maior ou igual que 18h
 * 
 * @author 822157057
 *
 */
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar c = Calendar.getInstance();

		int hora = c.get(Calendar.HOUR);
		int minutos = c.get(Calendar.MINUTE);

		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		if (hora >= 6 && hora < 12) {
			System.out.println("Bom dia, " + nome + "! : horario --> " + hora + ":" + minutos);
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde, " + nome + "! : horario --> " + hora + ":" + minutos);
		} else {
			System.out.println("Boa noite, " + nome + "! : horario --> " + hora + ":" + minutos); // hora >= 18
		}

		scanner.close();

	}
}
