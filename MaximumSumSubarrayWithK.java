package Programming;

/*Largest sum subarray with at-least k numbers
Input : arr[] = {-4, -2, 1, -3} 
k = 2
Output : -1
The sub array is {-2, 1}

Input : arr[] = {1, 1, 1, 1, 1, 1} 
k = 2
Output : 6 
The sub array is {1, 1, 1, 1, 1, 1}
Time Complexity: O(n)*/

public class MaximumSumSubarrayWithK {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -10, -3 };
		int k = 4;
		System.out.println(maxSumWithK(arr, arr.length, k));
	}

	static int maxSumWithK(int a[], int n, int k) {
		int maxSum[] = new int[n];
		maxSum[0] = a[0];
		int curr_max = a[0];
		for (int i = 1; i < n; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			maxSum[i] = curr_max;
		}
		int sum = 0;
		for (int i = 0; i < k; i++)
			sum += a[i];
		int result = sum;
		for (int i = k; i < n; i++) {
			sum = sum + a[i] - a[i - k];
			result = Math.max(result, sum);
			result = Math.max(result, sum + maxSum[i - k]);
		}
		return result;
	}
}
