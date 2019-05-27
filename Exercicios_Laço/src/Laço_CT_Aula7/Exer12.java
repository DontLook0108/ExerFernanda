package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num; 
		System.out.println("Digite um numero: ");
		num = s.nextInt(); 
		for(int cont = 1; cont <= num; cont+=2) {
			System.out.println(cont);
		}
		s.close();
	}

}
