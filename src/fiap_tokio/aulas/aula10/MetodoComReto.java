package fiap_tokio.aulas.aula10;

/**
 * 
 * Metodo com retorno
 * 
 * 
 * @author Miguel
 *
 */
public class MetodoComReto {

	public static void main(String[] args) {
		int a = 1, b = 2, retornoDaSoma;

		retornoDaSoma = somar(a, b);

		System.out.println("a soma resultou em: " + retornoDaSoma);
		System.out.println(saudacao());
	}

	static int somar(int a, int b) {
		return a + b;
	}
	
	
	/**
	 *  metodo com retorno sem parametro
	 */
	static String saudacao() {
		return "Ola Mundo";
	}

}
