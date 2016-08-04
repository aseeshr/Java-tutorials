package javastring;

public class MultiDimSimpleArray {
	public static void main(String[] args) {
		int mat[][] = new int[2][2];
		mat[0][0] = 10;
		mat[0][1] = 20;
		mat[1][0] = 30;
		mat[1][1] = 40;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
