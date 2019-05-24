import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		int cont; 
		int cont1; 
		int res;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		for(cont1 = 1; cont1 < 11; cont1 ++) {
			for(cont = 0; cont < 11; cont++) {
				res = cont * cont1;
				System.out.println(cont1+" * "+cont+" = "+res); 
			}
		}
		s.close();
	}

}
