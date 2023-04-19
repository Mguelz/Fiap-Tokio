package fiap_tokio.exercicios.extra;
/**
 * 4. Pedir ao usuário a digitação de um número inteiro qualquer, exibir o que se pede:
   a) O número digitado pelo usuário;
   b) O seu sucessor;
   c) O seu antecessor;
   d) O dobro do número digitado
   e) A metade do número digitado

 * @author Miguel
 */
public class Metodos {

	public int antecessor(int digitado) {
		return --digitado;
	}

	public int sucessor(int digitado) {
		return ++digitado;
	}

	public int dobro(int digitado) {
		return digitado *= 2;
	}
}
