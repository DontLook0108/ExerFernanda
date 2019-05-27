package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num=0, posi=0;
		
		for(int cont = 0; cont < 15; cont++) {
			System.out.print("Digite o "+(cont+1)+"º numero: ");
			num = s.nextInt(); 
			if (num > 0) {
				posi++;
			}
		}
		System.out.println("Foram digitados "+posi+" numeros positivos");
		s.close();
	}

}
