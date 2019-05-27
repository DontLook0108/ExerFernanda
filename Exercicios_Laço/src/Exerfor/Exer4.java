package Exerfor;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont, numero = 1, mult=0;
		
		System.out.println("Tabuada do 5: ");
		for(cont = 0;cont < 10;cont++) {
			mult = numero * 5;
			System.out.println(numero+" * 5: " +mult);
			numero++;
		}
		s.close();
	}

}
