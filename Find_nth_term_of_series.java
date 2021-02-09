package Programming;

/*Given a mathematical series as 3, 9, 21, 41, 71… For a given integer n, you have to find the nth number of this series.
Input : n = 4 
Output : 41

Input : n = 2
Output : 9*/
public class Find_nth_term_of_series {

	public static void main(String[] args) {
		int n = 8;
		System.out.println(seriesFunc(n));
		n = 13;
		System.out.println(seriesFunc(13));

	}

	static int seriesFunc(int n) {
		int sumSquare = (n * (n + 1) * (2 * n + 1)) / 6;
		int sumNatural = (n * (n + 1) / 2);
		return (sumSquare + sumNatural + 1);
	}
}
