package fiap_tokio.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {

//		String[] listaFrutas = new String[4];
//
//		listaFrutas[0] = "Kiwi";
//		listaFrutas[1] = "Jabuticaba";
//		listaFrutas[2] = "Maracuja Doce";
//		listaFrutas[3] = "Pitaia";
//
//		System.out.println("Fruta 1: " + listaFrutas[0]);
//		System.out.println("Fruta 2: " + listaFrutas[1]);
//		System.out.println("Fruta 3: " + listaFrutas[2]);
//		System.out.println("Fruta 4: " + listaFrutas[3]);
//
//		System.out.println("\n-----------------------------------------------\n");
//
//		String[] listaFrutas2 = { "Manga", "Jaca", "Tangerina", "Pitomba" };
//
//		int qtdFrutas = listaFrutas2.length;
//		System.out.println("tamanho da listaFrutas2: " + qtdFrutas);
//
//		System.out.println("\n-----------------------------------------------\n");
//
//		for (int i = 0; i < qtdFrutas; i++) {
//			System.out.println("Fruta: " + listaFrutas2[i]);
//		}

		// VETORES NUMERICOS

		int[] numeros = { 0, 5, 20, 30 };

		// for indexado
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("Posicao: %d --> Valor: %d \n", i, numeros[i]);
		}

		int qtdNotas = 20;
		double[] notas = new double[qtdNotas];
	}

}
