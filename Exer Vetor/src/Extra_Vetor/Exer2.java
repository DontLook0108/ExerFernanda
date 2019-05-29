package Extra_Vetor;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num[] = new int[16];
		
		System.out.println("Digite 15 numeros inteiros: ");
		for(int i = 1; i < 16; i++) {
			num[i] = s.nextInt(); 
		}
		for(int i = 1; i < 16; i++) {
			if(num[i] == 30) 
				System.out.println("O numero 30 apareceu na "+i+"º posição");
		}
		s.close();
	}

}
