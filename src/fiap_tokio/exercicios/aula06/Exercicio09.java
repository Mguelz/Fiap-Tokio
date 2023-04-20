package fiap_tokio.exercicios.aula06;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/**
 * 
 * Faça um algoritmo que calcule o valor da conta de luz de uma pessoa, empresa
 * etc. ▪ Sabe-se que o cálculo da conta de luz segue a tabela abaixo: 21
 * 
 *    Tipo cliente    | Valor do KW/h 
 *    1 (residência)  |   0,60 
 *    2 (comércio)    |   0,48 
 *    3 (indústria)   |   1,29
 * 
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Format formatador = new DecimalFormat("#.00");
		
		double luz, residencia = 0.6, comercio = 0.48, industria = 1.29;
		int tipoCliente;
		
		System.out.println("Voce ira fazer o calculo de uma: ");
		System.out.print("1 - Industria, 2 - Comercio ou 3 - Residencia? ");
		tipoCliente = scanner.nextInt();
		
		System.out.print("Digite o valor da conta: ");
		luz = scanner.nextDouble();
		
		
		switch (tipoCliente) {
		case 1:
			luz *= residencia;
			break;
		case 2:
			luz *= comercio;
			break;
		case 3:
			luz *= industria;
			break;
			
		default:
			System.err.println("Voce digitou algum dado errado");
		}
		
		System.out.print("A conta ficou no total de: " + formatador.format(luz));
		
		scanner.close();

	}

}
