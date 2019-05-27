package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num, trinta = 0;
		
		for(int cont = 0; cont < 15; cont++) {
			System.out.print("Digite um numero: ");
			num = s.nextInt(); 
			if (num > 30)
				trinta++;
		}
		System.out.println("Foi digitado um numero maior que 30 "+trinta+" vezes");
		s.close();
	}

}
