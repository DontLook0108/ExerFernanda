package Aula9;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		int m[][] = new int[5][5]; 
		int soma = 0;
		 
		Scanner s = new Scanner(System.in); 
		System.out.println("Digite os numeros da matriz");
		for(int i = 0; i < 5; i++) { 
			System.out.println((i+1)+"º linha");
			for(int j = 0;j < 5; j++) {
				m[i][j] = s.nextInt(); 
				if (i + j == 4) {
					soma += m[i][j];
				}
			} 
		} 
		System.out.println("A soma dos elementos é: "+soma);
		s.close();
	}

}
