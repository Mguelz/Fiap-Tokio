package fiap_tokio.exercicios.aula06;

/**
 * 
 * 
 * Considere a = 5, b = 7, c = 4 e d = 8 ▪ Julgue verdadeiro ou falso as
 * seguintes expressões:
 * 
 * A. (a <= b) e (b < d) B. (a = b) ou (c != b) C. (d > a) e (c >= b) D. (a <=
 * b) ou (c <= d) E. ((b > c) ou (c < a)) e (d <= b)
 * 
 * @author Miguel
 *
 */
public class Exercicio07 {
	public static void main(String[] args) {

		int a = 5, b = 7, c = 4, d = 8;

		boolean questaoA, questaoB, questaoC, questaoD, questaoE;

		// QUESTAO A
		questaoA = (a <= b) && (b < d);
		if (questaoA == true) {
			System.out.print("Questao A = ");
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// QUESTAO B
		questaoB = (a == b) || (c != b);
		System.out.print("Questao B = ");
		if (questaoB == true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// QUESTAO C
		questaoC = (d > a) && (c >= b);
		System.out.print("Questao C = ");
		if (questaoC == true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// QUESTAO D
		questaoD = (a <= b) || (c <= d);
		System.out.print("Questao D = ");
		if (questaoD == true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

		// QUESTAO E
		questaoE = ((b > c) || (c < a)) && (d <= b);
		System.out.print("Questao E = ");
		if (questaoE == true) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}

	}

}
