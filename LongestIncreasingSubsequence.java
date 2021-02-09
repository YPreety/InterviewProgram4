package Programming;

/*The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that 
all elements of the subsequence are sorted in increasing order. 
For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.*/

/*Input  : arr[] = {3, 10, 2, 1, 20}
Output : Length of LIS = 3
The longest increasing subsequence is 3, 10, 20

Input  : arr[] = {3, 2}
Output : Length of LIS = 1
The longest increasing subsequences are {3} and {2}

Input : arr[] = {50, 3, 10, 7, 40, 80}
Output : Length of LIS = 4
The longest increasing subsequence is {3, 7, 40, 80}*/

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int A[] = { 2, 5, 3, 7, 11, 8, 10, 13, 6 };
		int n = A.length;
		System.out.println("Length of Longest Increasing Subsequence is " + LongestIncreasingSubsequenceLength(A, n));

	}

	static int LongestIncreasingSubsequenceLength(int A[], int size) {

		int[] tailTable = new int[size];
		int len; 

		tailTable[0] = A[0];
		len = 1;
		for (int i = 1; i < size; i++) {
			if (A[i] < tailTable[0])
				tailTable[0] = A[i];

			else if (A[i] > tailTable[len - 1])
				tailTable[len++] = A[i];

			else
				tailTable[CeilIndex(tailTable, -1, len - 1, A[i])] = A[i];
		}

		return len;
	}

	static int CeilIndex(int A[], int l, int r, int key) {
		while (r - l > 1) {
			int m = l + (r - l) / 2;
			if (A[m] >= key)
				r = m;
			else
				l = m;
		}

		return r;
	}

}
