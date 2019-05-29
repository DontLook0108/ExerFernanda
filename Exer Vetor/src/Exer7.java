import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int vet[] = new int[10]; 
		int vin = 0; 
		
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < 10; i++) {
			vet[i] = s.nextInt(); 
			if(vet[i] == 20) {
				vin++;
			}
		}
		System.out.println("O numero 20 aparece "+vin+" vezes");
		s.close();
	}

}
