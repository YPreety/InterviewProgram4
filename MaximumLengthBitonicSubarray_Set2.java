package Programming;

//Maximum Length Bitonic Subarray | Set 2 (O(n) time and O(1) Space)

public class MaximumLengthBitonicSubarray_Set2 {

	public static void main(String[] args) {
		int A[] = { 12, 4, 78, 90, 45, 23 };
		System.out.println("Length of maximal length bitonic " + "subarray is " + maxLenBitonic(A, A.length));
	}

	static int maxLenBitonic(int[] A, int n) {
		if (n == 0)
			return 0;
		int maxLen = 1;
		int start = 0;
		int nextStart = 0;
		int j = 0;
		while (j < n - 1) {
			while (j < n - 1 && A[j] <= A[j + 1])
				j++;
			while (j < n - 1 && A[j] >= A[j + 1]) {
				if (j < n - 1 && A[j] > A[j + 1])
					nextStart = j + 1;
				j++;
			}
			maxLen = Math.max(maxLen, j - (start - 1));
			start = nextStart;
		}
		return maxLen;
	}

}
