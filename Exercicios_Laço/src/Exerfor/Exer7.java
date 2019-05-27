package Exerfor;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont=1, numero, fat=0; 
		
		System.out.println("Digite um numero maior que 0: ");
		numero = s.nextInt(); 
		if(numero < 0)
			System.out.println("Numero invalido, digite novamente");
		else {
			for(numero=0; numero > cont; numero--) {
				fat *= numero;
			}
			System.out.println("Fatorial: "+fat);
		}
		s.close();
	}

}
