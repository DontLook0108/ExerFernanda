package La�o_CT_Aula7;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num=0, soma=0;
		
		for(int cont = 0; cont < 20; cont++) {
			System.out.println("Digite um numero inteiro: ");
			num = s.nextInt(); 
			soma+=num;
		} 
		System.out.println("Media: "+(soma/20));
		s.close();
	}

}