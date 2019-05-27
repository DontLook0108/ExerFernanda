package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num=0;
		for(int cont = 10; cont < 51; cont++) {
			if(cont % 2 == 0) {
				num = cont; 
				System.out.println(num);
			}
		}
		s.close();
	}

}
