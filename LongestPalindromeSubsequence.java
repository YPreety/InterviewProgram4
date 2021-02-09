package Programming;

/*Longest palindrome subsequence with O(n) space
Input : abbaab
Output : 4

Input : geeksforgeeks
Output : 5
Time Complexity : O(n*n)
Auxiliary Space : O(n)*/

public class LongestPalindromeSubsequence {

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		System.out.println(lps(str));

	}

	static int lps(String s) {
		int n = s.length();
		int a[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			int back_up = 0;
			for (int j = i; j < n; j++) {
				if (j == i)
					a[j] = 1;
				else if (s.charAt(i) == s.charAt(j)) {
					int temp = a[j];
					a[j] = back_up + 2;
					back_up = temp;
				}
				else {
					back_up = a[j];
					a[j] = Math.max(a[j - 1], a[j]);
				}
			}
		}
		return a[n - 1];
	}

}
