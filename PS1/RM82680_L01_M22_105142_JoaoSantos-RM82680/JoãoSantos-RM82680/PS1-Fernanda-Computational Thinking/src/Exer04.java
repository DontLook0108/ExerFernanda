import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int num = 0, resul = 0; 
		
		System.out.println("Digite um numero: ");
		num = s.nextInt(); 
		
		for(int i = 0; i < 11; i++) {
			resul = num * i; 
			System.out.println(num+" * "+i+" = "+resul);
		}
		s.close();
	}

}
