import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		int codigo = 0, qtdePe�as = 0, Totpe�as = 0, esc1 = 0, esc2 = 0, esc3 = 0, maiorpec = 0;
		float salario = 1200, Totsalario = 0, maiorsal = 0;
		Scanner s = new Scanner(System.in);

		for (int i = 1; i < 21; i++) {
			do {
				System.out.println("Digite a quantidade de pe�as fabricadas: ");
				qtdePe�as = s.nextInt();
				if (qtdePe�as < 0) {
					System.out.println("Quantidade inv�lida, digite novamente: ");
					qtdePe�as = s.nextInt();
				}
			} while (qtdePe�as <= 0);
			if (i==0) {
				qtdePe�as = maiorpec;
			}
			if (qtdePe�as <= 30) {
				esc1++;
				salario = 1200;
				Totpe�as += qtdePe�as;
				Totsalario += salario;
			} else 
			if ((qtdePe�as > 30) & (qtdePe�as < 41)) {
				esc2++;
				salario = 1200 + (qtdePe�as * 10);
				Totpe�as += qtdePe�as;
				Totsalario += salario;
			} else
			if (qtdePe�as >= 41) {
				esc3++;
				salario = 1200 + (qtdePe�as * 15);
				Totpe�as += qtdePe�as;
				Totsalario += salario;
			} 
			if (qtdePe�as >= maiorpec) {
				maiorpec = qtdePe�as; 
				maiorsal = salario; 
				codigo = i;
			}
		}
		System.out.println("A folha de pagamento do m�s foi de: " + Totsalario + " R$");
		System.out.println("A quantidade total de pe�as foi de: " + Totpe�as + " pe�as");
		System.out.println("Operarios classe 1: " + esc1);
		System.out.println("Operarios classe 2: " + esc2);
		System.out.println("Operarios classe 3: " + esc3);
		System.out.println("Melhor operario: codigo n� " + codigo + " que fez " + maiorpec + " pe�as e ganhou "+maiorsal+" R$");
		s.close();
	}
}
