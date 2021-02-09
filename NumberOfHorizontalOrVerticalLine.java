package Programming;

/*Number of horizontal or vertical line segments to connect 3 points
Input : A  = {-1, -1}, B = {-1, 3}, C = {4, 3}
Output :   2
Input :A = {1, 1}, B = {2, 3} C = {3, 2}
Output : 3*/
public class NumberOfHorizontalOrVerticalLine {

	public static void main(String[] args) {
		int x[] = new int[3], y[] = new int[3];
		x[0] = -1;
		y[0] = -1;
		x[1] = -1;
		y[1] = 3;
		x[2] = 4;
		y[2] = 3;
		System.out.println(countLineSegments(x, y));
	}

	static int countLineSegments(int x[], int y[]) {
		if ((x[0] == x[1] && x[1] == x[2]) || (y[0] == y[1] && y[1] == y[2]))
			return 1;
		else if (canJoin(x, y, 0, 1, 2) || canJoin(x, y, 0, 2, 1) || canJoin(x, y, 1, 2, 0))
			return 2;
		else
			return 3;
	}

	static boolean canJoin(int x[], int y[], int i, int j, int k) {
		return (x[k] == x[i] || x[k] == x[j]) && isBetween(y[i], y[j], y[k])
				|| (y[k] == y[i] || y[k] == y[j]) && isBetween(x[i], x[j], x[k]);
	}

	static boolean isBetween(int a, int b, int c) {
		return (Math.min(a, b) <= c && c <= Math.max(a, b));
	}
}
