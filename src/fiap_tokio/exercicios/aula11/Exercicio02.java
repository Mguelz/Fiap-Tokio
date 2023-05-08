package fiap_tokio.exercicios.aula11;

/**
 * 
 * Faça um método que receba como parâmetro a idade de uma pessoa. ▪ A função
 * deve retornar a string se o voto da pessoa é: ▪ Obrigatório ▪ Proibido ▪
 * Opcional
 * 
 * @author Miguel
 *
 */
public class Exercicio02 {

	public static void main(String[] args) {
		int idade = 16;

		System.out.println("Idade: " + idade);
		System.out.print("Seu voto eh: ");
		System.out.println(votar(idade));

	}

	public static String votar(int idade) {
		if (idade < 16) {
			return "Proibido";
		} else if (idade > 15 && idade < 18) {
			return "Opcional";
		} else if (idade > 18) {
			return "Obrigatório";
		} else if (idade > 59) {
			return "Opcional";
		}
		
		return null;
	}

}
