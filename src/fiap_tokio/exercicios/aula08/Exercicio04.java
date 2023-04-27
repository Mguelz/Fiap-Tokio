package fiap_tokio.exercicios.aula08;

/**
 * 
 * Faça a seguinte operação matemática:
 * 
 * x = raiz quadrada de 81
 * 
 * y = (5x + (2x ao quadrado) + (raiz cubica de 8) - PI.x) / ((3 elevada a 4) + x) 
 * 
 * 
 * https://drive.google.com/drive/u/0/folders/1ekbnJdUj1RNM6kIKZJMDDz8DmTEYJljB
 * (apostila 8, exercicio 4)
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio04 {

	public static void main(String[] args) {
		
		
		double x = Math.sqrt(81);
		System.out.println(x);
		
		double y = 5*x + (Math.pow(2, 2) *x) + Math.cbrt(8) - Math.PI * x / Math.pow(3, 4) + x;
		
		System.out.println(y);
		System.out.println(Math.PI);
		

	}

}
