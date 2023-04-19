package fiap_tokio.aulas.aula05;

public class Operadores {
	public static void main(String[] args) {

		float num1 = 5f;
		float num2 = 2f;

		// soma
		float soma = num1 + num2;
		System.out.println(soma);

		// subtração
		float sub = num1 - num2;
		System.out.println(sub);

		// multiplicação
		float multi = num1 * num2;
		System.out.println(multi);

		// divisão
		float div = num1 / num2;
		System.out.println(div);

		// resto/módulo
		float resto = num1 % num2;
		System.out.println(resto);

		System.out.println("-----------------------------------------------------------");

		// operadores unários
		int numero = 15;
		System.out.println(numero);

//		numero++;
		System.out.println(numero++);
		System.out.println(++numero);
		System.out.println(numero);
		System.out.println(numero + 1);
		System.out.println(numero);
		System.out.println(--numero);

		System.out.println("-----------------------------------------------------------");
		// operador de atribuição
		int number = 5;
		number += 5;
		System.out.println(number);

		number -= 2;
		System.out.println(number);
		
		number *= 2;
		System.out.println(number);
		
		number *= 2;
		System.out.println(number);
		
		
		
		
	}
}
