package Aula9;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		int a[][] = new int[2][2]; 
		int b[][] = new int[2][2]; 
		int soma[][] = new int[2][2]; 
		
		Scanner s = new Scanner(System.in); 
		System.out.println("Primeira Matriz");
		for(int i = 0; i < 2; i++) {
			System.out.println((i+1)+"º linha");
			for(int j = 0; j < 2; j++) { 
				System.out.println("Digite os numeros da matriz: ");
				a[i][j] = s.nextInt();
			}
		}  
		System.out.println("Segunda Matriz");
		for(int i = 0; i < 2; i++) { 
			System.out.println((i+1)+"º linha");
			for(int j = 0; j < 2; j++) { 
				System.out.println("Digite os numeros da matriz: ");
				b[i][j] = s.nextInt();
			}
		} 
		System.out.println("Soma das Matrizes: ");
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				soma[i][j] = a[i][j] + b[i][j];  
				System.out.print("\t"+soma[i][j]);
			} 
			System.out.println();
		} 
		s.close();
	}

}
