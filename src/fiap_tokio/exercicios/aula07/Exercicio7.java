package fiap_tokio.exercicios.aula07;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int nota, acimaDaMedia = 0, abaixoDaMedia = 0, media = 0;

		for (int i = 0; i < 20; i++) {
			System.out.println("Informe a nota do aluno " + i + 1);
			nota = scanner.nextInt();

			System.out.println("A nota do aluno " + (i + 1) + " foi " + nota);

			media += nota;

			if (nota > 5) {
				acimaDaMedia++;
			}

			if (nota < 5) {
				abaixoDaMedia--;
			}

		}
		
		

		System.out.println("a media da sala é: " + media);
		System.out.println("quantidade acima da media " + acimaDaMedia);
		System.out.println("quantidade abaixo da media " + abaixoDaMedia);

		scanner.close();
	}
}
