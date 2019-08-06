import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int codProd;
		int codVend = 0;
		float precoProd, maisCaro = 0;

		for (int i = 0; i < 25; i++) {
			System.out.print("Digite o codigo do produto: ");
			codProd = s.nextInt();
			if (codProd <= 0) {
				System.out.print("Codigo inválido, digite novamente: ");
				codProd = s.nextInt();
			}
			System.out.print("Digite o preço do produto: ");
			precoProd = s.nextFloat();
			if (precoProd <= 0) {
				System.out.print("Preço inválido, digite novamente: ");
				precoProd = s.nextFloat();
			}
			if (precoProd > maisCaro) {
				maisCaro = precoProd;
				codVend = codProd;
			}
		}
		System.out.println("O produto mais caro é o de codigo " + codVend + " com preço de " + maisCaro + "R$");
		s.close();
	}
}
