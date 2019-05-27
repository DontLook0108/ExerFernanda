package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0, maior = 0, menor = 999;

		for (int cont = 0; cont < 10; cont++) {
			System.out.print("Digite um numero: ");
			num = s.nextInt();
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		s.close();
	}

}
