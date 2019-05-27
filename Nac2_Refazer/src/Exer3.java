import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		int codigo = 0, qtdePeças = 0, Totpeças = 0, esc1 = 0, esc2 = 0, esc3 = 0, maiorpec = 0;
		float salario = 1200, Totsalario = 0, maiorsal = 0;
		Scanner s = new Scanner(System.in);

		for (int i = 1; i < 21; i++) {
			do {
				System.out.println("Digite a quantidade de peças fabricadas: ");
				qtdePeças = s.nextInt();
				if (qtdePeças < 0) {
					System.out.println("Quantidade inválida, digite novamente: ");
					qtdePeças = s.nextInt();
				}
			} while (qtdePeças <= 0);
			if (i==0) {
				qtdePeças = maiorpec;
			}
			if (qtdePeças <= 30) {
				esc1++;
				salario = 1200;
				Totpeças += qtdePeças;
				Totsalario += salario;
			} else 
			if ((qtdePeças > 30) & (qtdePeças < 41)) {
				esc2++;
				salario = 1200 + (qtdePeças * 10);
				Totpeças += qtdePeças;
				Totsalario += salario;
			} else
			if (qtdePeças >= 41) {
				esc3++;
				salario = 1200 + (qtdePeças * 15);
				Totpeças += qtdePeças;
				Totsalario += salario;
			} 
			if (qtdePeças >= maiorpec) {
				maiorpec = qtdePeças; 
				maiorsal = salario; 
				codigo = i;
			}
		}
		System.out.println("A folha de pagamento do mês foi de: " + Totsalario + " R$");
		System.out.println("A quantidade total de peças foi de: " + Totpeças + " peças");
		System.out.println("Operarios classe 1: " + esc1);
		System.out.println("Operarios classe 2: " + esc2);
		System.out.println("Operarios classe 3: " + esc3);
		System.out.println("Melhor operario: codigo nº " + codigo + " que fez " + maiorpec + " peças e ganhou "+maiorsal+" R$");
		s.close();
	}
}
