package fiap_tokio.aulas.exerc_aula05;

import java.util.Scanner;

/**
 * 
 * Faça o cálculo contrário do último exercício (Exercício 10): ▪ Leia um valor
 * inteiro correspondente à idade de uma pessoa em dias e informe-a em anos,
 * meses e dias. Também considere todo ano com 365 dias e todo mês com 30 dias.
 * 
 * @author logonrmlocal
 *
 */
public class Desafio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int qtdDias = 0;
		int diasTotais = 0, anos = 0, meses = 0, dias = 0;

		System.out.println("Digite quantos dias de vida voce tem");
		qtdDias = scanner.nextInt();

		System.out.println("");

		anos += qtdDias / 365; // quantidade de anos 
		qtdDias -= (anos * 365); // excluindo todos os 365 dias que é equivalente a ano
				
		if (qtdDias < 365) {
			meses += qtdDias / 12; // quantidade de meses
		}
		
		qtdDias -= (meses * 12); // atualizando a variavel para que ela fique somente com os dias
		
		// TODO terminar o calculo de dias
		if (qtdDias < 30) {
			qtdDias += diasTotais / 30; // quantidade de dias
		}
		
		
		System.out.println("Voce tem " + anos + " anos, " + meses + " meses," + dias + " dias");
		scanner.close();
	}
}
