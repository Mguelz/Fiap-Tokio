package fiap_tokio.aula05;

public class OperadoresLogicos {
	public static void main(String[] args) {

		boolean verificarSenha = true;
		boolean verificarEmail = false;
		boolean logicaE = verificarSenha && verificarEmail;
		System.out.println(logicaE);

		boolean logicaOu = false || true;
		System.out.println(logicaOu);

		boolean negacao = !true;
		System.out.println(negacao);

		System.out.println("---------------------------------------------------------");
		// operadores de strings

		String nome1 = "Joana";
		String nome2 = "Joana";
		String nome3 = new String("Joana");
		System.out.println(nome1 == nome2);
		System.out.println(nome1 == nome3);
		System.out.println(nome1.equals(nome3));

	}
}
