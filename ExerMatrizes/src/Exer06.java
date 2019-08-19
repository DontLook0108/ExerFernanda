import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		int cod[] = new int[5];
		String nome[] = new String[5];
		float m[][] = new float[5][6];
		String lojas[] = new String[6];
		float menor_preco[] = new float[6];
		String nome_loja = "";

		Scanner s = new Scanner(System.in);

		System.out.println("Digite o codigo do produto: ");
		for (int i = 0; i < 5; i++) {
			cod[i] = s.nextInt();
		}
		System.out.println("Digite o nome do produto: ");
		for (int i = 0; i < 5; i++) {
			nome[i] = s.next();
		}
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o nome da loja: ");
			lojas[i] = s.next();
			System.out.println("Preço na loja " + lojas[i] + ":");
			for (int j = 0; j < 5; j++) {
				m[j][i] = s.nextFloat();
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (j == 0) {
					menor_preco[i] = m[i][j];
					nome_loja = lojas[j];
				} else {
					if (m[i][j] < menor_preco[i]) {
						menor_preco[i] = m[i][j];
						nome_loja = lojas[j];
					}
				}
			}
			System.out.println("O produto " + nome[i] + " de codigo " + cod[i] + " foi encontrado na loja " + nome_loja
					+ " por R$ " + menor_preco[i]);
		}
		s.close();
	}
}
