package Programming;

import java.util.Arrays;

/*Find number of pairs in an array such that their XOR is 0
Input : A[] = {1, 3, 4, 1, 4}
Output : 2
Explanation : Index (0, 3) and (2, 4)

Input : A[] = {2, 2, 2}
Output : 3
Time Complexity : O(N)*/

public class NumberOfPairsInAnArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2, 4 };
		int n = a.length;
		System.out.println(calculate(a, n));
	}

	static int calculate(int a[], int n) {
		Arrays.sort(a);
		int count = 1;
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] == a[i - 1]) {
				count += 1;
			} else {
				answer = answer + (count * (count - 1)) / 2;
				count = 1;
			}
		}
		answer = answer + (count * (count - 1)) / 2;
		return answer;
	}
}
