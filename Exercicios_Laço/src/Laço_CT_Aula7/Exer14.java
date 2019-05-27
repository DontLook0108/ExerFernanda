package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int numB, numA; 
		
		System.out.print("Digite o numero A: ");
		numA = s.nextInt(); 
		System.out.print("Digite o numero B: ");
		numB = s.nextInt();
		
		for (int cont = 2; cont <= numB; cont++) {
			numA *= numB; 
		}
		System.out.println(numA);
		s.close();
	}

}
