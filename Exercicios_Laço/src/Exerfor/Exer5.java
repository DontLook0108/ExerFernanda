package Exerfor;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int cont, idade=0,soma=0;
		double media;
		
		System.out.println("Digite as 50 idades: ");
		for(cont = 1; cont < 51; cont++) {
			System.out.println((cont)+"º idade: ");
			idade = s.nextInt(); 
			if (idade < 0) {
				System.out.println("Idade invalida, digite novamente");
				idade = s.nextInt();
			}
			soma += idade; 
		}
		media = soma/50;
		System.out.println("Media das idades: "+media);
		s.close();
	}

}
