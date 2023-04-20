package fiap_tokio.exercicios.aula06;

import java.util.Scanner;

/**
 * 
 * 
 * Faça um programa que leia 3 valores que representam os lados de um triângulo
 * A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o
 * maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três
 * lados formam, com base nos seguintes casos: ▪ Se A ≥ B+C, apresente a
 * mensagem: NAO FORMA TRIANGULO; ▪ Se A2 = B2 + C2 , apresente a mensagem:
 * TRIANGULO RETANGULO; ▪ Se A2 > B2 + C2 , apresente a mensagem: TRIANGULO
 * OBTUSANGULO; ▪ Se A2 < B2 + C2 , apresente a mensagem: TRIANGULO ACUTANGULO;
 * ▪ Se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO;
 * ▪ Se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO
 * ISOSCELES;
 * 
 * @author Miguel
 *
 */
public class Exercicio12_Desafio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = 0, b = 0, c = 0;
		String naoFormaTriangulo;
		String retangulo, obtusangulo, acutangulo, equilatero, isosceles; // todos esses são triangulos

		System.out.print("Digite o valor de A: ");
		a = scanner.nextInt();
		System.out.print("Digite o valor de B: ");
		b = scanner.nextInt();
		System.out.print("Digite o valor de C: ");
		c = scanner.nextInt();
		System.out.println("");
		
		

		if (a == b && a == c && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if(a == b || a == c)

		scanner.close();
	}

}
