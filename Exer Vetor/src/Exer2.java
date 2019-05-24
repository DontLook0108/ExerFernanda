import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float vet1[] = new float[2]; 
		float vet2[] = new float[2]; 
		float res[] = new float[2]; 
		
		System.out.println("Digite 2 numeros: ");
		for (int i = 0; i < 2; i++) {
			 vet1[i] = s.nextFloat();
			 vet2[i] = s.nextFloat();
			res[i] = vet1[i] + vet2[i]; 
		}
		for(int i=0; i<2; i++) {
			System.out.println("soma: "+res[i]);
		}
		s.close();
	}
}