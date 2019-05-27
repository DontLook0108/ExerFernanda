package Exerfor;

import java.util.Scanner;

public class Exer6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont, numero=0; 
		
		System.out.print("Digite um numero inteiro: ");
		numero = s.nextInt(); 
		if(numero > 1)
			System.out.println("Sequencia de pares: ");
		for(cont = 2; cont <= numero; cont += 2) {
			System.out.println(cont);
		}
		s.close();
	}

}
