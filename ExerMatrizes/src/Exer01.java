
public class Exer01 {

	public static void main(String[] args) {
		int m[][] = new int[5][6];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				if (j % 2 != 0) {
					m[i][j] = 1;
				} else {
					m[i][j] = 0;
				}
				System.out.printf("\t" + m[i][j]);
			}
			System.out.println();
		}
	}
}
