package Exerfor;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont, numero = 0, soma = 0;
		
		System.out.println("Digite 40 numeros: ");
		for(cont=0; cont < 40; cont++) {
			System.out.println((cont + 1)+"º numero: ");
			numero = s.nextInt(); 
			if (numero % 2 == 0)
				soma += numero;
		}
		System.out.println("Soma: "+soma);
		s.close();
	}

}
