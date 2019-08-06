import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num[] = new int[30];
		int par = 0;
		int impar[] = new int[30];

		System.out.println("Digite 30 numeros inteiros: ");
		for (int i = 0; i < 30; i++) {
			num[i] = s.nextInt();
			if (num[i] <= 0) {
				System.out.println("Somente números maiores que 0(zero). Digite novamente: ");
				num[i] = s.nextInt();
			}
			if (num[i] % 2 == 0) {
				par++;
			}
			if ((num[i] % 2 == 1) || (num[i] == 1)) {
				impar[i] = num[i];
			}

		}
		System.out.println("Apareceram " + par + " numeros pares");
		System.out.print("Numeros impares: \n");
		for (int j = 0; j < 30; j++) {
			if (impar[j] > 0)
				System.out.println(impar[j]);
		}
		s.close();
	}
}
