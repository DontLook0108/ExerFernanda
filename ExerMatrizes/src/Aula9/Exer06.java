package Aula9;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		int m[][] = new int[4][4]; 
		
		Scanner s = new Scanner(System.in); 
		for(int i =0; i < 4; i++) {
			for(int j =0; j < 4; j++) {
				m[i][j] = s.nextInt();
			}
		} 
		s.close();
	}

}
