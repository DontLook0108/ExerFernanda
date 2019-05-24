import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vet[] = new int[10]; 
		int mult[] = new int[10];
		
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < 10; i++) {
			vet[i] = s.nextInt(); 
			mult[i] = vet[i] * 2; 
		}
		for(int i = 0; i < 10; i++) {
		System.out.println(mult[i]);
		}
		s.close();
	}

}
