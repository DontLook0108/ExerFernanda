import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int tabu[] = new int[11]; 
		
		System.out.println("Tabuada do 2: ");
		for(int i = 1; i < 11; i++) {
			tabu[i] = 2 * i; 
		}
		for(int i = 1; i < 11; i++) {
			System.out.println(tabu[i]);
		}
		s.close();
	}

}
