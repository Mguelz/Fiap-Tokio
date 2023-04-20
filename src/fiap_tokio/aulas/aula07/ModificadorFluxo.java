package fiap_tokio.aulas.aula07;

/**
 * 
 * Modificador de fluxo
 * 
 * @author Miguel
 *
 */
public class ModificadorFluxo {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;

			if (i == 3 || i == 5) {
				continue;
			}
			System.out.println("Cambalhota " + i);

			if (i == 7) {
				break;
			}
		}
		System.out.println("Fim");
	}
}
