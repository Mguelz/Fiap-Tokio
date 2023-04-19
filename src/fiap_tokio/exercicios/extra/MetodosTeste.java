package fiap_tokio.exercicios.extra;

import java.util.Scanner;

public class MetodosTeste {

	public static void main(String[] args) {
		Metodos md = new Metodos();
		Scanner scanner = new Scanner(System.in);

		int digitado;
		System.out.println("--------------------- Primeiro Exercício Extra ---------------------");
		System.out.println("digite um numero inteiro");
		digitado = scanner.nextInt();

		System.out.println("numero digitado: " + digitado);
		System.out.println("numero antecesosr: " + md.antecessor(digitado));
		System.out.println("numero sucessor: " + md.sucessor(digitado));
		System.out.println("dobro: " + md.dobro(digitado));

		scanner.close();
	}

}
