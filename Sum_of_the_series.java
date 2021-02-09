package Programming;

/*Find the sum up to n terms of the sequence: 5 + 55 + 555 + … up to n.
Input : 2
Output: 60

Input : 3
Output: 595*/
public class Sum_of_the_series {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(sumOfSeries(n));
	}

	static int sumOfSeries(int n) {
		return (int) (0.6172 * (Math.pow(10, n) - 1) - 0.55 * n);
	}
}
