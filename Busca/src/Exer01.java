import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		int menu = 0;
		int cod_peça[] = new int[6];

		Scanner s = new Scanner(System.in);

		for (int i = 1; i < 2; i++) {
			System.out.println(
					"Menu: \n" + "<1>Cadastrar \n" + "<2>Vender \n" + "<3>Comprar \n" + "<4>Listar \n" + "<5>Sair");
			menu = s.nextInt();
			if (menu < 1 || menu > 5) {
				System.out.println("Opção inválida, digite novamente: ");
				menu = s.nextInt();
			} else {
				switch (menu) {
				case 1:
					System.out.println("Cadastrar Produto: ");
					System.out.print("");
				}
			}
		}
	}
}
