import java.util.Scanner;

public class Exer_Tabela {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int qtdeVend = 0;
		float preco = 0, totVend = 0, desconto = 0;
		String procedencia = "";
		for (int i = 0; i < 1; i++) {
			do {
				System.out.println("Digite o preço do produto: ");
				preco = s.nextFloat();
				if (preco <= 0) {
					System.out.println("Preço inválido, digite novamente: ");
					preco = s.nextFloat();
				} else {
					System.out.println("Digite a quantidade vendida: ");
					qtdeVend = s.nextInt();
					if (qtdeVend <= 0) {
						System.out.println("Quantidade vendida inválida, digite novamente: ");
						qtdeVend = s.nextInt();
					} 
					totVend = preco * qtdeVend;
				}
			} while (preco <= 0);
			if (totVend <= 500.00) {
				procedencia = "Sul, Norte e Leste"; 
				desconto = totVend - (totVend * 5/100);  
			} else 
				if ((totVend > 500.00) && (totVend <= 2000.00)) {
					procedencia = "Sul, Norte e Oeste"; 
					desconto = totVend - (totVend * 1/10);
				} else {
					if (totVend > 2000.00) {
						procedencia = "Todas as regiões"; 
						desconto = totVend - (totVend * 2/10); 
					}
				} 
			if (totVend > 10000) {
				System.out.println("Parabéns, você ganhou um cupom no valor de R$50,00 para ser utilizada na próxima compra!");
			}
		}
		System.out.println(procedencia);
		System.out.println(desconto);
		s.close();
	}

}
