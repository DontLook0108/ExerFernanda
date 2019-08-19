
public class Exer05 {

	public static void main(String[] args) {
		int m[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j == m.length - 1) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
				System.out.print("\t" + m[i][j]);
			}
			System.out.println();
		}
	}

}
