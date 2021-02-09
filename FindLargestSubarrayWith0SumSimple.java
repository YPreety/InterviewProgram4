package Programming;

/*Given an array of integers, find length of the largest subarray with sum equals to 0.
Input: arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
Output: 5
The largest subarray with 0 sum is -2, 2, -8, 1, 7

Input: arr[] = {1, 2, 3}
Output: 0
There is no subarray with 0 sum

Input: arr[] = {1, 0, 3}
Output: 1

Time complexity is O(n2).*/

public class FindLargestSubarrayWith0SumSimple {

	public static void main(String[] args) {
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int n = arr.length;
		System.out.println("Length of the longest 0 sum " + "subarray is " + maxLen(arr, n));

	}

	static int maxLen(int arr[], int n) {
		int max_len = 0;

		for (int i = 0; i < n; i++) {
			int curr_sum = 0;
			for (int j = i; j < n; j++) {
				curr_sum += arr[j];
				if (curr_sum == 0)
					max_len = Math.max(max_len, j - i + 1);
			}
		}
		return max_len;
	}

}
