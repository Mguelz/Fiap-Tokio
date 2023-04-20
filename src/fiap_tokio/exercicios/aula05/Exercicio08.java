package fiap_tokio.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double real;
		double cotacaoDolar = 5.06;
		double cotacaoEuro = 5.55;
		double cotacaoPesoArgentino = 0.023;
		double cotacaoLibraEsterlina = 6.30;
		double cotacaoLene = 0.038;

		System.out.print("Digite o valor em reais: ");
		real = scanner.nextDouble();
		System.out.println("");

		double dolar = real / cotacaoDolar;
		double euro = real / cotacaoEuro;
		double pesoArgentino = real / cotacaoPesoArgentino;
		double libraEsterlina = real / cotacaoLibraEsterlina;
		double lene = real / cotacaoLene;

		System.out.printf("dolar:  %s \n", dolar);
		System.out.printf("euro: %s \n", euro);
		System.out.printf("peso argentino: %s \n", pesoArgentino);
		System.out.printf("libra esterlina: %s \n", libraEsterlina);
		System.out.printf("lene: %s \n", lene);

		scanner.close();
	}
}
