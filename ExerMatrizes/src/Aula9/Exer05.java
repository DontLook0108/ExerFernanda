package Aula9;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		int m[][] = new int[5][4]; 
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Digite 20 numeros inteiro: ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				m[i][j] = s.nextInt();  
			} 
		} 
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print("\t" + m[i][j]);
			}  
			System.out.println();
		} 
		s.close();
	}

}
