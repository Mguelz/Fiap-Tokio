package fiap_tokio.aulas.aula08;

public class MathOperadores {

	public static void main(String[] args) {

		double PI = Math.PI;
		System.out.println(PI);

		// raiz quadrada
		System.out.println(Math.sqrt(225));
		System.out.println(Math.sqrt(-225));

		// numero absoluto
		System.out.println(Math.abs(-25));

		// arredondar para cima
		double num = 3.05;
		System.out.println(Math.ceil(num));

		// arredonda para baixo
		System.out.println(Math.floor(num));

		// arredonda certinho
		System.out.println(Math.round(num));
		
		// arredonda para baixo o PI
		System.out.println(Math.ceil(Math.PI));
		
		System.out.println("\n\n");
		// --------------------------------------------
		
		// classe random
		double random = Math.random();
		System.out.println(random);
		
		double multiplica = random * 5;
		System.out.println(multiplica);
		
		// arredonda um numero aleatorio para cima (nunca dara 0 - mesmo sendo de 0 até 4,99999)
		System.out.println(Math.ceil(multiplica));
		
		System.out.println("\n\n");
		// --------------------------------------------
		random = Math.random();
		System.out.println(random);
		
		double min = 5, max = 10;
		
		double preparandoIntervalo = random * (max - min); 
		double intervalo = min + random * (max - min); // maximo é 5 (10 - 5 = 5)
		
		System.out.println("Preparando Intervalo: " + preparandoIntervalo);
		System.out.println("Intervalo " + intervalo);
		
	}

}
