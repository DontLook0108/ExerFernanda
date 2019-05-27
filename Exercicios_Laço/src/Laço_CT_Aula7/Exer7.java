package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num; 
		for(int cont = 1;cont < 11; cont++) {
			System.out.println("Digite um numero inteiro: ");
			num = s.nextInt();
			System.out.println(num * 2);
		}
		s.close();
	}

}
