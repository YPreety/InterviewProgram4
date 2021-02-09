package Programming;

public class Print_2DArray_foreach {

	public static void main(String[] args) {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		print2D(mat);
	}

	public static void print2D(int mat[][]) {
		for (int[] row : mat)
			for (int x : row)
				System.out.print(x + " ");
	}
}
