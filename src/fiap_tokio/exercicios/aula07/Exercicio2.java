package fiap_tokio.exercicios.aula07;

/**
 * Contagem de 0 a 100 pulando de 10 em 10. ▪ O terminal deve ficar assim:
 * 
 * 0 10 20 30 40 50 60 70 80 90 100 (um em baixo do outro)
 * 
 * @author 822157057
 *
 */
public class Exercicio2 {

	public static void main(String[] args) {

		int i = 0;

		while (i < 100) {
			i += 10;
			System.out.println(i);
		}

	}

}
