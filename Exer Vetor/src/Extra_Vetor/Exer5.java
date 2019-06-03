package Extra_Vetor;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num = 0; 
		int num2 = 0;
		int rep = 0;
		int curso1[] = new int[num]; 
		int curso2[] = new int[num2]; 
		int repeti[] = new int[rep];
		
		System.out.println("Informe o numero de alunos no curso de Plataforma de Mobilidade Corporativa – IOS: ");
		num = s.nextInt(); 
		System.out.println("Informe o numero de alunos no curso de Driven Design: ");
		num2 = s.nextInt(); 
		
		System.out.println("Digite o numero das matriculas dos alunos que cursam Plataforma de Mobilidade Corporativa – IOS: ");
		for(int i = 0; i < num; i++) {
			curso1[i] = s.nextInt(); 				
		} 
		System.out.println("Digite o números das matrículas dos alunos que cursam Driven Design: ");
		for(int i = 0; i < num2; i++) {
			curso2[i] = s.nextInt(); 
			
			if(curso1[i] == curso2[i]) {
				rep++;
				repeti[i] = curso1[i];
			}
		} 
		System.out.println("Matriculas repetidas:");
		for(int i = 0; i < rep; i++) {
			repeti[i] = s.nextInt();
		}
		s.close();
	}

}
