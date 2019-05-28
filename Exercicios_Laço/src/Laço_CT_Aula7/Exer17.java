package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idades = 0, pessoas = 0, media_idades = 0;

		for (int cont = -1; cont < pessoas; cont++) {
			System.out.println("Digite a sua idade: ");
			idades = s.nextInt();
			media_idades += idades;
			if (idades == -1) {
				System.out.println("Entraram no clube " + pessoas + " pessoas");
				System.out.println("A media de idade das pessoas foi de: "+(media_idades/pessoas));
			} else {
			pessoas++; 
			}
		}
		s.close();
	}

}
