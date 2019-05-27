import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = 0, cont = 0, soma = 0;

		System.out.println("Digite 30 numeros inteiro: ");
		while (cont < 30) {
			System.out.println((cont + 1) + "o. numero: ");
			numero = s.nextInt();
			soma += numero;
			cont++;
		}
		System.out.println("Soma: " + soma);
		s.close();
	}
}