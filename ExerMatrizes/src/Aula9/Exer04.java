package Aula9;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		int m[][] = new int[8][8]; 
		float soma = 0; 
		float num = 0;
		
		Scanner s = new Scanner(System.in); 
		for(int i = 0; i < 8; i++) {
			System.out.println((i+1)+"º linha"); 
			for(int j = 0; j < 8; j++) {
				System.out.print("Digite o numero: "); 
				m[i][j] = s.nextInt(); 
				if(i == j) {
					soma += m[i][j]; 
					num++;
 				}
			}
		} 
		System.out.println("A média da diagonal principal é: "+(soma/num)); 
		s.close();
	}

}
