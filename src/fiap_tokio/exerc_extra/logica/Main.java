package fiap_tokio.exerc_extra.logica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Metodos md = new Metodos();
		Scanner scanner = new Scanner(System.in);

		int digitado;

		System.out.println("digite um numero inteiro");
		digitado = scanner.nextInt();

		System.out.println("numero digitado: " + digitado);
		System.out.println("numero antecesosr: " + md.antecessor(digitado));
		System.out.println("numero sucessor: " + md.sucessor(digitado));
		System.out.println("dobro: " + md.dobro(digitado));

		scanner.close();
	}

}
