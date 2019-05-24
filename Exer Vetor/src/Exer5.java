import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num[] = new int[5];
		int par = 0;
		int impar = 0;
		
		System.out.println("Digite 5 numeros: ");
		for(int i = 0; i < 5; i++) {
			num[i] = s.nextInt(); 
			if (num[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Numeros pares: "+par);
		System.out.println("Numeros impares: "+impar);
		s.close();
	}

}
