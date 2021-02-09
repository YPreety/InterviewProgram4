package Design_Patterns;

import java.util.Arrays;

/*Find minimum cost to buy all books

Given an array of ratings for n books. Find the minimum cost to buy all books with below conditions :

Cost of every book would be at-least 1 dollar.
A book has higher cost than an adjacent (left or right) if rating is more than the adjacent.
Input : Ratings[] = {1, 3, 4, 3, 7, 1}
Output : 10
Exp :- 1 + 2 + 3 + 1 + 2 + 1 = 10

Input : ratings[] = {1, 6, 8, 3, 4, 1, 5, 7}
Output : 15
Exp :- 1 + 2 + 3 + 1 + 2 + 1 + 2 + 3 = 15
Time complexity – O(n)
Auxiliary Space – O(n)
*/
public class MinimumCostBooks {

	public static void main(String[] args) {
		int ratings[] = { 1, 6, 8, 3, 4, 1, 5, 7 };
		int n = ratings.length;
		System.out.print(minCost(ratings, n));

	}

	public static int minCost(int ratings[], int n) {
		int res = 0;
		int left2right[] = new int[n];
		int right2left[] = new int[n];
		;

		// fill 1 in both array
		Arrays.fill(left2right, 1);
		Arrays.fill(right2left, 1);

		// Traverse from left to right and assign
		// minimum possible rating considering
		// only left adjacent
		for (int i = 1; i < n; i++)
			if (ratings[i] > ratings[i - 1])
				left2right[i] = left2right[i - 1] + 1;

		// Traverse from right to left and assign
		// minimum possible rating considering only
		// right adjacent
		for (int i = n - 2; i >= 0; i--)
			if (ratings[i] > ratings[i + 1])
				right2left[i] = right2left[i + 1] + 1;

		// Since we need to follow rating rule for
		// both adjacent, we pick maximum of two
		for (int i = 0; i < n; i++)
			res += Math.max(left2right[i], right2left[i]);

		return res;
	}

}
