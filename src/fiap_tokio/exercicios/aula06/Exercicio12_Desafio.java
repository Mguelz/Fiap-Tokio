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
//		String naoFormaTriangulo;
//		String retangulo, obtusangulo, acutangulo, equilatero, isosceles; // todos esses são triangulos

		System.out.print("Digite o valor de A: ");
		a = scanner.nextInt();
		System.out.print("Digite o valor de B: ");
		b = scanner.nextInt();
		System.out.print("Digite o valor de C: ");
		c = scanner.nextInt();
		System.out.println("");

		// ordenar de forma decrescente. De forma com que A > B > C
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a < c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if (b < c) {
			int temp = b;
			b = c;
			c = temp;
		}
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);

		// exibir o nome de cada triangulo

		if (a >= (b + c)) {
			System.out.println("nao forma triangulo"); // somente colocar um else para nao precisar fazer nenhuma logica
														// || (a <= b + c)
		} else if (a == b && a == c && b == c) {
			System.out.println("Triangulo Equilatero");
		}
		if ((a == b && b != c) || (a != b && b == c) || (c == b && b != a)) {
			System.out.println("Triangulo Isosceles");
		}
		if ((a * a) > ((b * b) + (c * c))) {
			System.out.println("Triangulo Obtusangulo");
		}
		if ((a * a) < ((b * b) + (c * c))) {
			System.out.println("Triangulo Acutangulo");
		}
		if ((a * a) == ((b * b) + (c * c))) {
			System.out.println("Triangulo Retangulo");
		}

		scanner.close();
	}

}

//  // primeira tentativa
//
//if (a == b && a == c && b == c) {
//	System.out.println("Triangulo Equilatero"); // certo
//} else if ((a == b && b != c) || (a != b && b == c) || (c == b && b != a)) {
//	System.out.println("Triangulo Isosceles"); // certo
//} else if ((a * a) > ((b * b) + (c * c))) {
//	System.out.println("Triangulo Obtusangulo"); // certo
//} else if ((a * a) < ((b * b) + (c * c))) {
//	System.out.println("Triangulo Acutangulo"); // somente o 5,7,8 esta funcionando
//} else if ((a * a) == ((b * b) + (c * c))) {
//	System.out.println("Triangulo Retangulo"); // certo
//} else {
//	System.out.println("nao forma triangulo"); // somente colocar um else para nao precisar fazer nenhuma logica || (a <= b + c)
//}
