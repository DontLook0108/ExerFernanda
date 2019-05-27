import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = 0, cont = 0, soma = 0;

		System.out.println("Digite 40 numeros: ");
		while (cont < 40) {
			System.out.println((cont + 1) + "o. numero: ");
			numero = s.nextInt();
			if (numero % 2 == 0)
				soma += numero;
			cont++;
		}
		System.out.println("Soma: " + soma);
		s.close();
	}
}