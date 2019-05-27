import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = 0, cont = 0, soma = 0;

		System.out.println("Digite 15 numero: ");
		while (cont < 15) {
			System.out.println((cont + 1) + "o. numero: ");
			numero = s.nextInt();
			if (numero < 0)
				soma += numero;
			cont++;
		}
		System.out.println("Soma: " + soma);
		s.close();

	}

}
