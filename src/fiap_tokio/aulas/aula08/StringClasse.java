package fiap_tokio.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {

		String str = "FIAP Paulista";

		int tamanho = str.length();
		System.out.println("Tamanho da string " + tamanho);

		for (int i = 0; i < tamanho; i++) {
			System.out.println(str.charAt(i) + " - " + i);
		}
	}

}
