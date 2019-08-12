
public class Exer01 {

	public static void main(String[] args) {
		int m[][] = new int[5][6];
		int c = 1;

		for (int a = 0; a < m.length; a++) {
			for (int b = 0; b < 6; b++) {
				m[a][b] = c == 0 ? ++c : --c;
			}
		}

		for (int b = 0; b < m.length; b++) {
			String linha = "";
			for (int a = 0; a < 6; a++) {
				linha += m[b][a] + "|";
			}
			System.out.println(linha);
		}

	}
}
