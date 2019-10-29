import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x=0, y=0;
		double res=0; 
		
		System.out.println("Digite o primeiro número: ");
		x = s.nextInt();

		System.out.println("Digite o segundo número: ");
		y = s.nextInt();

		res = potencia(x, y);
		System.out.println(x+"^"+y+" = "+res);
		s.close();
	}

	public static double potencia(int num1, int num2) {
		 
		double res = num1;
		for(int i = 1; i < num2; i++) {
			res *= num1;
		}
		return res;
	}

}
