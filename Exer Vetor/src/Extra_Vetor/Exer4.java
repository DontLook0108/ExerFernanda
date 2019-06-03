package Extra_Vetor;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float num[] = new float[10];
		float soma = 0;
		int neg = 0;
		
		System.out.println("Digite 10 numeros reais: ");
		for(int i = 0; i < 10; i++) {
			num[i] = s.nextFloat();
			if(num[i] < 0) {
				neg++; 
			} 
			if(num[i] >= 0) {
				soma += num[i];
			}
		} 
		System.out.println("Possui "+neg+" numeros negativos");
		System.out.println("A soma dos numeros positivos é: "+soma);
		s.close();
	}

}
