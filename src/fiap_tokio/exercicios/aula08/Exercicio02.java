package fiap_tokio.exercicios.aula08;

import java.util.Calendar;

/**
 * 
 * Faça um programa que verifica o dia da semana. ▪ Se for terça-feira, exiba ao
 * usuário que terá feira de rua.
 * 
 * 
 * @author 822157057
 *
 */
public class Exercicio02 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		int diaDaSemana = c.get(Calendar.DAY_OF_WEEK);

		if (diaDaSemana == 3) {
			System.out.println("Hoje tem feira de rua!");
		} else {
			System.out.println("Hoje nao tem feira de rua");
		}

		System.out.println();
	}
}
