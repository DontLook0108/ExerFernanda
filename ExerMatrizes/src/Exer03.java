
public class Exer03 {

	public static void main(String[] args) {
		int m[][] = new int[5][5]; 
		
		
		for(int a = 0; a < m.length; a++) {
			int c = 1;
			for(int b = 0; b < 5; b++) {
				m[a][b] = c; 
			}  
		} 
		
		for(int b = 0; b < m.length; b++) {
			String linha = "";  
			for(int a = 0; a < 5; a++) {
				linha += m[b][a] + ""; 
			} 
			System.out.println(linha);
		}

	}

}
