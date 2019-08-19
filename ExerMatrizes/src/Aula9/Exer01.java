package Aula9;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		int m[][] = new int[7][2]; 
		int num = 0;
		
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 7; i++) { 
			System.out.println((i+1)+"º linha");
			for(int j = 0; j < 2; j++) {
				System.out.print("Digite o numero: "); 
				m[i][j] = s.nextInt();  
				if (m[i][j] >= 10 && m[i][j] <= 20) {
					num++;
				}
			}
		}
		System.out.println("Existem "+num+" numeros entre 10 e 20"); 
		s.close();
	}

}
