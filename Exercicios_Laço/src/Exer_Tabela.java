import java.util.Scanner;

public class Exer_Tabela {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int qtdeVend, codOrigem, desconto;
		float preco, totVend;
		String procedencia;
		for (int i = 0; i < 21; i++) {
			do {
				System.out.println("Digite o pre�o do produto: ");
				preco = s.nextFloat();
				if (preco <= 0) {
					System.out.println("Pre�o inv�lido, digite novamente: ");
					preco = s.nextFloat();
				} else {
					System.out.println("Digite a quantidade vendida: ");
					qtdeVend = s.nextInt();
					if (qtdeVend <= 0) {
						System.out.println("Quantidade vendida inv�lida, digite novamente: ");
						qtdeVend = s.nextInt();
					} else {
						System.out.println("Digite o codigo de origem: ");
						codOrigem = s.nextInt();
						if ((codOrigem <= 0) & (codOrigem > 30)) {
							System.out.println("Codigo de Origem inv�lido, digite novamente: ");
							codOrigem = s.nextInt();
						}
					}
				}
			} while (preco <= 0);
			
		}
		s.close();
	}

}
