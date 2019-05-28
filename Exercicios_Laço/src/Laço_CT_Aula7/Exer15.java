package Laço_CT_Aula7;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		float media, melhor_media1 = 0, melhor_media2 = 0, melhor_media3 = 0, melhor_media4 = 0, melhor_media5 = 0;
		int aluno1 = 0,aluno2 = 0,aluno3 = 0,aluno4 = 0,aluno5 = 0;
		
		for(int cont = 0; cont < 35; cont++) {
			System.out.println("Digite sua media: ");
			media = s.nextFloat();  
			if (media > melhor_media1) {
				melhor_media2 = melhor_media1;
				melhor_media1 = media; 
				aluno1 = cont + 1;
			} 
			if (media < melhor_media1 && media > melhor_media2) {
				melhor_media2 = media;
				aluno2 = cont + 1;
			}
			if (media < melhor_media2 && media > melhor_media3) {
				melhor_media3 = media;
				aluno3 = cont + 1;
			}
			if (media < melhor_media3 && media > melhor_media4) {
				melhor_media4 = media;
				aluno4 = cont + 1;
			}
			if (media < melhor_media4 && media > melhor_media5) {
				melhor_media5 = media;
				aluno5 = cont + 1;
			}
		}
		System.out.println("1: aluno "+aluno1+" media "+melhor_media1);
		System.out.println("2: aluno "+aluno2+" media "+melhor_media2);
		System.out.println("3: aluno "+aluno3+" media "+melhor_media3);
		System.out.println("4: aluno "+aluno4+" media "+melhor_media4);
		System.out.println("5: aluno "+aluno5+" media "+melhor_media5);
		s.close();
	}

}
 