package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0, soma = 0;
		
		for(int cont = 0; cont < 100; cont++) {
			System.out.println("Digite um numero inteiro: ");
			num = s.nextInt(); 
			if ((num % 2 == 1) | (num == 1)) {
				soma+=num;
			}
		}
		System.out.println("Soma: "+soma);
		s.close();
	}

}
