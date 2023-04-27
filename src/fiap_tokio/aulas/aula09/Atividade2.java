package fiap_tokio.aulas.aula09;

public class Atividade2 {
	
	public static void main(String[] args) {
		int[][] matriz = new int[4][5];

			int qtdLinhas = matriz.length;
			int qtdColunas = matriz.length;
			
			System.out.println("Quantidade de Linhas: "+qtdLinhas);
			System.out.println("Quantidade de Colunas: "+qtdColunas);
			System.out.println(" ");
			
			
			// atribuindo
			for (int i = 0; i < qtdLinhas; i++) {
				for (int j = 0; j < qtdColunas; j++) {
					matriz[i][j] = 5;
				}
			}
			
			// atribuindo e exibindo
			for (int i = 0; i < qtdLinhas; i++) {
				for (int j = 0; j < qtdColunas; j++) {
					System.out.println(matriz[i][j]+" ");
				}
				System.out.println(" ");
			}

	}
}
