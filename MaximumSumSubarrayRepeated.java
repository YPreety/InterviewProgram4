package Programming;

/*Maximum subarray sum in an array created after repeated concatenation
Input  : arr[] = {-1, 10, 20}, k = 2
Output : 59
After concatenating array twice, we 
get {-1, 10, 20, -1, 10, 20} which has 
maximum subarray sum as 59.

Input  : arr[] = {-1, -2, -3}, k = 3
Output : -1*/
public class MaximumSumSubarrayRepeated {

	public static void main(String[] args) {
		int a[] = { 10, 20, -30, -1 };
		int n = a.length;
		int k = 3;
		System.out.println("Maximum contiguous sum is " + maxSubArraySumRepeated(a, n, k));
	}

	static int maxSubArraySumRepeated(int a[], int n, int k) {
		int max_so_far = 0;
		int INT_MIN, max_ending_here = 0;
		for (int i = 0; i < n * k; i++) {
			max_ending_here = max_ending_here + a[i % n];
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}
