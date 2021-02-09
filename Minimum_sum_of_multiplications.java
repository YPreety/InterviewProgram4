package Programming;

/*Minimum sum of multiplications of n numbers
Input : 40 60 20 
Output : 2400  

Input : 5 6 
Output : 30 
Time Complexity: O(n^3)
Auxiliary Space: O(n^2)*/

public class Minimum_sum_of_multiplications {

	static long dp[][] = new long[1000][1000];

	public static void main(String[] args) {
		int a[] = { 40, 60, 20 };
		int n = a.length;
		intialize(n);
		System.out.println(solve(a, 0, n - 1));
	}

	static void intialize(int n) {
		for (int i = 0; i <= n; i++)
			for (int j = 0; j <= n; j++)
				dp[i][j] = -1;
	}

	static long solve(int a[], int i, int j) {
		if (i == j)
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];
		dp[i][j] = 100000000;
		for (int k = i; k < j; k++) {
			dp[i][j] = Math.min(dp[i][j], (solve(a, i, k) + solve(a, k + 1, j) + (sum(a, i, k) * sum(a, k + 1, j))));
		}
		return dp[i][j];
	}

	static long sum(int a[], int i, int j) {
		long ans = 0;
		for (int m = i; m <= j; m++)
			ans = (ans + a[m]) % 100;
		return ans;
	}
}
