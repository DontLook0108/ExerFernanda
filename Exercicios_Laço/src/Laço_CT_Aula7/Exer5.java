package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=0;
		
		for(int cont = 50; cont < 201; cont++) {
			if (cont % 5 == 0) {
				num = cont; 
			System.out.println(num);
		}
			}
		s.close();
	}

}
