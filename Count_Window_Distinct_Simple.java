package Programming;

import java.util.Arrays;

/*Count distinct elements in every window of size k

Given an array of size n and an integer k, return the of count of distinct numbers in all windows of size k.

Input:  arr[] = {1, 2, 1, 3, 4, 2, 3};
k = 4
Output:
3
4
4
3

Explanation:
First window is {1, 2, 1, 3}, count of distinct numbers is 3
Second window is {2, 1, 3, 4} count of distinct numbers is 4
Third window is {1, 3, 4, 2} count of distinct numbers is 4
Fourth window is {3, 4, 2, 3} count of distinct numbers is 3

Time complexity is O(nk2).*/

public class Count_Window_Distinct_Simple {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 4, 2, 3 }, k = 4;
		countDistinct(arr, arr.length, k);
	}

	static void countDistinct(int arr[], int n, int k) {
		for (int i = 0; i <= n - k; i++)
			System.out.println(countWindowDistinct(Arrays.copyOfRange(arr, i, arr.length), k));
	}

	static int countWindowDistinct(int win[], int k) {
		int dist_count = 0;
		for (int i = 0; i < k; i++) {
			int j;
			for (j = 0; j < i; j++)
				if (win[i] == win[j])
					break;
			if (j == i)
				dist_count++;
		}
		return dist_count;
	}
}
