package Design_Patterns;

import java.util.Arrays;

/*Minimize cost of operation to equalize tower heights

Input : h[] = {2, 4, 8}
cost[] = {10, 100, 1000}
Output : 460

Input : Tower heights h[] = {1, 2, 3}
Costs of operations cost[] = {10, 100, 1000}
Output : 120*/

public class EqualizeTowerHeights {

	public static void main(String[] args) {
		int h[] = { 1, 2, 3 };
		int cost[] = { 10, 100, 1000 };
		int n = h.length;
		System.out.println(Bsearch(n, h, cost));

	}

	static long Bsearch(int n, int h[], int cost[]) {
		int max_h = Arrays.stream(h).max().getAsInt();
		long ans = Long.MAX_VALUE;

		// Do binary search for minimum cost
		long high = 1 + max_h;
		long low = 0;
		while (high > low) {
			int mid = (int) ((low + high) >> 1);

			// Cost below mid
			long bm = (mid > 0) ? costOfOperation(n, h, cost, mid - 1) : Long.MAX_VALUE;

			// Cost at mid
			long m = costOfOperation(n, h, cost, mid);

			// Cost above mid
			long am = costOfOperation(n, h, cost, mid + 1);

			// Break if the answer becomes equal to
			// minimum cost m
			if (ans == m)
				break;

			// ans should hold the minimum cost of operation
			ans = Long.min(ans, m);

			// Search lower cost
			if (bm <= m)
				high = mid;

			// Search higher cost
			else if (am <= m)
				low = mid + 1;
		}

		return ans;
	}

	static long costOfOperation(int n, int h[], int cost[], int eq_h) {
		// Initialize initial cost to 0
		long c = 0;

		// Adding cost for each tower
		for (int i = 0; i < n; i++)
			c += Math.abs(h[i] - eq_h) * cost[i];

		return c;
	}

}
