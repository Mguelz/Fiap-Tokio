package fiap_tokio.exercicios.aula09;

import java.util.Scanner;

/**
 * 
 * Escreva um algoritmo que recebe uma lista de nomes e imprime os nomes na
 * ordem inversa a da leitura. ▪ A lista termina quando o usuário aperta o Enter
 * sem que nenhum nome tenha sido digitado.
 * 
 * 
 * @author Miguel
 *
 */
public class exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String digitado;
		System.out.println("Qual a quantidade de nomes que voce ira digitar");
		int qtdNome = scanner.nextInt();

		
		String[] nome = new String[qtdNome];

		
		for (int i = 0; i < nome.length; i++) {
			System.out.print("Digite um nome: ");
			digitado = scanner.next();
			nome[i] = digitado;
			qtdNome++;
		}
		// TODO terminar a logica

		for (String string : nome) {
			System.out.println(string);
		}

		scanner.close();
	}

}
