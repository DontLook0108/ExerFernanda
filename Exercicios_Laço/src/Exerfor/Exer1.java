package Exerfor;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont, soma=0, numero=0;
		
		System.out.println("Digite 30 numeros: ");
		
		for(cont=0; cont < 30; cont++) {
			System.out.println((cont+1)+"º numero: ");
			numero = s.nextInt(); 
			soma += numero;
		}
		System.out.println("Soma: "+soma);
		s.close();
	}

}
