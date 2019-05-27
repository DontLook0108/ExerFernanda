import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = 1, idade = 0, soma = 0;
		double media;

		System.out.println("Digite 50 idades: ");
		while (cont < 51) {
			System.out.println(cont + "º idade: ");
			idade = s.nextInt();
			if (idade < 0) {
				System.out.println("Digite novemente: ");
				idade = s.nextInt();
			}
			cont++;
			soma += idade;
		}
		media = soma / 50;
		System.out.println("A media de idade é: " + media);
		s.close();
	}

}
