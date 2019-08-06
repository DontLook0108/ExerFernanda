import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, cadFunc = 0;
		float somaSal = 0;
		int menu = 0;

		System.out.print("Digite a quantidade de funcionários: ");
		n = s.nextInt();

		String nome[] = new String[n];
		float sal[] = new float[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Menu: ");
			System.out.println("<1>Cadastrar funcionário <2>Listar funcionários <3>Sair: ");
			menu = s.nextInt();
			if ((menu < 1) || (menu > 3)) {
				System.out.println("Escolha inexistente, digite novamente: ");
				menu = s.nextInt();
			}
			if (menu == 1) {
				System.out.print("Digite seu nome: ");
				nome[i] = s.next();
				System.out.print("Digite seu salário: ");
				sal[i] = s.nextFloat();
				somaSal += sal[i];
				cadFunc++;
			} else {
				if (menu == 2) {
					for (int j = 0; j <= cadFunc; j++) {
						System.out.println("Nome: " + nome[j] + " Salario: " + sal[j] + "R$");
					}
					System.out.println(cadFunc + " funcionários cadastrados e a soma dos salarios = " + somaSal + "R$");
				} else {
					if (menu == 3)
						System.out.println("Saindo...");
						i = n;
				}
			}

		}
		s.close();
	}
}