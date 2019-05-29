package Extra_Vetor;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vet[] = new int[7];
		int mult2[] = new int[7];
		int mult3[] = new int[7];
		int mult2_3[] = new int[7];
		
		
		System.out.println("Digite 7 numeros inteiros: ");
		for (int i = 0; i < 7; i++) {
			vet[i] = s.nextInt();

			if (vet[i] > 0 && vet[i] % 2 == 0) {
				mult2[i] = vet[i];
			}
			if (vet[i] > 0 && vet[i] % 3 == 0) {
				mult3[i] = vet[i];
			}
			if ((vet[i] % 2 == 0) && (vet[i] % 3 == 0)) {
				mult2_3[i] = vet[i];
			}
		}
		s.close();
	}

}
