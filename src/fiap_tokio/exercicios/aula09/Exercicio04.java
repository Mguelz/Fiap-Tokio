package fiap_tokio.exercicios.aula09;

import java.util.Random;

/**
 * 
 * Considere uma turma de n alunos onde desejamos calcular a média das notas da
 * prova semestral e saber quantas notas estão iguais, acima e abaixo dessa
 * média. ▪ Escreva um algoritmo que lê um inteiro n representando a quantidade
 * de alunos e cada uma das n notas e mostra a média da turma, quantas notas são
 * iguais, acima e abaixo da média da turma.
 * 
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio04 {

	public static void main(String[] args) {
		Random random = new Random();

		int qtdAlunos = random.nextInt(9, 10); // minimo de 9 alunos em uma sala
		double nota = 0, acimaDaMedia = 0, abaixoDaMedia = 0;
		double naMedia = 0;
		double[] alunos = new double[qtdAlunos];

		// adicionando notas em cada indice do vetor
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = random.nextDouble(0, 11); // notas de 0 até 10
			nota = (int) Math.round(alunos[i]);

			// imprimindo a nota de todos os alunos
			System.out.println("Nota do aluno " + (i + 1) + " --> " + nota);

			if (nota < 6) {
				abaixoDaMedia++;
			}
			if (nota > 5) {
				acimaDaMedia++;
			}

			naMedia += nota;

		}

		// pegar a quantidade de alunos e dividir pela soma de todos as notas, assim
		// gerando a media
		naMedia = naMedia / alunos.length;

		System.out.println("\nQuantidade de alunos - " + qtdAlunos);
		System.out.println("Quantidade de alunos acima da media - " + (int) acimaDaMedia);
		System.out.println("Quantidade de alunos abaixo da media - " + (int) abaixoDaMedia);
		System.out.println("Quantidade de alunos na media - " + (int) naMedia);

	}
}
