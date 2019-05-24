import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vet1[] = new int[10];
		int vet2[] = new int[10];

		System.out.println("Digite 10 numeros: ");
		for (int i = 0; i < 10; i++) {
			vet1[i] = s.nextInt(); // numero de vetores e copia
			vet2[i] = vet1[i];
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(vet2[i]);
		}
		s.close();
	}

}
