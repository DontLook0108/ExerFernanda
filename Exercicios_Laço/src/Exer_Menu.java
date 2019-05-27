import java.util.Scanner;

public class Exer_Menu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1, num2,menu;
		for (int i = 0; i < 21; i++) {
			do {
				System.out.println("Menu de opções: <1> Somar dois numeros <2> Multiplo de 3 <3>Sair");
				menu = s.nextInt();
				if (menu <= 0) {
					System.out.println("Opção inválida. Digite novamente");
					menu = s.nextInt();
				}
			} while (menu <= 0);

			switch (menu) {
			case 1:
				System.out.print("Digite o primeiro numero: ");
				num1 = s.nextInt();
				System.out.print("Digite o segundo numero: ");
				num2 = s.nextInt();
				System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
				break;
			case 2:
				System.out.println("Digite um numero inteiro: ");
				num1 = s.nextInt();
				if (num1 % 3 == 0) {
					System.out.println("É multiplo");
				} else {
					System.out.println("Não é multiplo");
				}
				break;
			default:
				System.out.println("Saindo...");
				break;
			}
		}
		s.close();
	}
}