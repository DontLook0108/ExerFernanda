package Exerfor;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont, soma=0, numero=0;
		
		System.out.println("Digite 15 numeros: ");
		for(cont=0; cont < 15; cont++) {
			System.out.println((cont + 1)+"º numero: ");
			numero = s.nextInt();
			if (numero < 0)
				soma += numero;
		}
		System.out.println("Soma: "+soma);
		s.close();
	}

}
