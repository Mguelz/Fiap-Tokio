package fiap_tokio.aulas.aula05;

import java.util.Scanner;

public class Manipulacao {

	public static void main(String[] args) {

		double salario = 1300.00;
		String salarioStr = Double.toString(salario);
		System.out.println(salarioStr);

		System.out.println("--------------------------------------");

		String idade = "25";
		int idadeConvertida = Integer.parseInt(idade);
		System.out.println("sua idade é: " + idadeConvertida);
//		System.out.println("tipo da variavel: " + idadeConvertida.getClass().getSimpleName()); // isso se caso o int for Integer
																							   // como pegar o tipo que esta variavel é (double, int, byte, etc)
		System.out.println("--------------------------------------");
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite o preco do produto");
		String preco = scanner.nextLine();

		float precoConvertido = Float.parseFloat(preco);
		System.out.println("Preco convertido: " + precoConvertido);

		scanner.close();

	}

}
