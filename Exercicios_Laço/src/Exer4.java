import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cont = 1, mult = 1;

		System.out.println("Tabuada do 5: ");
		while (cont < 11) {
			mult = cont * 5;
			System.out.println(cont + " * 5 = " + mult);
			cont++;
		}
		s.close();
	}

}
