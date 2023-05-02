package fiap_tokio.exercicios.aula09;

/**
 * 
 * Faça um programa que tenha 2 vetores. Um vetor para os meses e outros para a
 * quantidade de dias para cada mês.
 * 
 * ▪ Seu programa deve exibir mensagens da seguinte forma: ▪ O Mês de Jan tem 31
 * dias ao todo. ▪ O mês de Fev tem 28 dias ao todo. ▪ O mês de Mar tem 31 dias
 * ao todo. ▪ ... ▪ O mês de Dez tem 31 dias ao todo.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio05 {

	public static void main(String[] args) {

		String[] meses = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez" };
		int[] dias = { 31, 28, 30, 31, 30, 31, 30, 31, 30, 31, 30, 31 };

		for (int i = 0; i < meses.length; i++) {
			System.out.println("O Mes de " + meses[i] + " tem " + dias[i] + " dias ao todo");
		}

	}

}
