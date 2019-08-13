import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		int m[][] = new int [4][4]; 
		int r[][] = new int [4][4];
		int maior_num = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os numeros da matriz: ");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				m[i][j] = s.nextInt();
				if (m[i][j] > maior_num) {
					maior_num = m[i][j];
				}
			}
		} 
		System.out.println("Matriz: ");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				 r[i][j] = m[i][j] * maior_num;
				 System.out.print("\t"+r[i][j]);
			}  
			System.out.println();
		}  
		s.close();
	}

}
