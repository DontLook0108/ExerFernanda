import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = 2, numero = 0;

		System.out.println("Digite um numero inteiro: ");
		numero = s.nextInt();
		if (numero > 1)
			System.out.println("Sequencia de pares: ");
		while (cont <= numero) {
			System.out.println(cont);
			cont += 2;
		}
		s.close();
	}
}
