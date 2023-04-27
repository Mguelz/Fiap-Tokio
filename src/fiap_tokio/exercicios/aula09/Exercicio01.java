package fiap_tokio.exercicios.aula09;

/**
 * 
 * Considerando o trecho de código Java representado a seguir:
 * 
 * int[] v = {2, 0, 3, 9}; v[v[2]] = v[v[1]]; for (int i: v){
 * System.out.print(i); }
 * 
 * 
 * ▪ O que será impresso na tela?
 * 
 * x a) 2 0 3 2 (correto) b) 2 0 3 9 c) 2 0 0 9 d) 2 3 3 2
 * 
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio01 {

	public static void main(String[] args) {

		int[] v = { 2, 0, 3, 9 };

		//  v3 = 2    v0 = 2
		v[v[2]] = v[v[1]]; // neste momento esta sendo atribuido o valor 2 na posição 3
		for (int i : v) {
			System.out.print(i);
		}

	}

}
