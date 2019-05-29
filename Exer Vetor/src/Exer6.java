import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double num[] = new double[8];

		System.out.println("Digite 7 numeros: ");
		for (int i = 1; i < 8; i++) {
			num[i] = s.nextInt();
		}
		for (int i = 1; i < 8; i++) {
			if (num[i] == 18)
				System.out.println("Posiçao do numero: " + i + "º indice");
		}
		s.close();
	}
}