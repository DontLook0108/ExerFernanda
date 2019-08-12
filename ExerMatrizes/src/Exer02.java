import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		int m[][] = new int [4][4]; 
		int r[][] = new int [4][4];
		int maior_num = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os numeros da matriz: ");
		for(int a = 0; a < m.length; a++) {
			for(int b = 0; b < 4; b++) {
				m[a][b] = s.nextInt();
				if (m[a][b] > maior_num) {
					maior_num = m[a][b];
				}
			}
		} 
		
		for(int a = 0; a < m.length; a++) {
			for(int b = 0; b < 4; b++) {
				 r[a][b] = m[a][b] * maior_num;
			} 
		} 
		
		for(int b = 0;  b < m.length; b++) {
			String linha = "";
			for(int a = 0; a < 4; a++) {
				linha += r[b][a] + " "; 
			} 
			System.out.println(linha);
		}
		System.out.println(maior_num);
		s.close();
	}

}
