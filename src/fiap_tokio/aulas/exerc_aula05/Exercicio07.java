package fiap_tokio.aulas.exerc_aula05;

import java.util.Scanner;

/**
 * 
 * Crie um programa que receba o valor do produto e valor pago. ▪ Calcule o
 * troco a ser pago. ▪ O valor do troco deve ser exibido no terminal.
 * 
 * @author logonrmlocal
 *
 */
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double valorProduto, valorPago, troco;

		System.out.print("Digite o valor do produto: ");
		valorProduto = scanner.nextDouble();
		System.out.print("Digite o valor a ser pago: ");
		valorPago = scanner.nextDouble();

		troco = valorPago - valorProduto;

		System.out.println("Troco a ser pago: " + troco);

		scanner.close();
	}
}
