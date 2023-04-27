package fiap_tokio.exercicios.aula09;

/**
 * 
 * Execute o trecho Java a seguir e marque a opção que contém o valor que será
 * exibido na tela:
 * 
 * String s = "FIAPTOKIO"; char[] r = new char[9]; for (int i = s.length() - 1;
 * i >= 0; i--) { r[i] = s.charAt(i); } for (char letra: r) {
 * System.out.print(letra); }
 * 
 * x a) OIKOTPAIF (correto) b) FIAPTOKIO c) 1110162068068 d) 150,251,02
 * 
 * @author Miguel
 *
 */
public class Exercicio02 {

	public static void main(String[] args) {

		String s = "FIAPTOKIO";
		char[] r = new char[9];

		// reordena o indice de traz para frente ficando = (OIKOTPAIF)
		for (int i = s.length() - 1; i >= 0; i--) {
			r[i] = s.charAt(i);
		}
		// imprime os valores de traz para frente ficando (FIAPTOKIO)
		for (char letra : r) {
			System.out.print(letra);
		}

	}

}
