import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = 0, cont = 1, fat = 1;

		System.out.println("Digite o numero maior que 0: ");
		numero = s.nextInt();
		if (numero < 0)
			System.out.println("Numero invalido, digite novamente.");
		else {
			while (numero > cont) {
				fat *= numero;
				numero--;
			}
			System.out.println("Fatorial do numero digitado: " + fat);
		}
		s.close();
	}

}
