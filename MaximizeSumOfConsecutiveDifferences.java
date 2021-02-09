package Programming;

import java.util.Arrays;

/*Maximize sum of consecutive differences in a circular array

Input : arr[] = { 4, 2, 1, 8 }
Output : 18
Rearrange given array as : { 1, 8, 2, 4 }
Sum of difference between consecutive element
= |1 - 8| + |8 - 2| + |2 - 4| + |4 - 1|
= 7 + 6 + 2 + 3
= 18.

Input : arr[] = { 10, 12, 15 }
Output : 10

Time Complexity: O(nlogn).
Auxiliary Space : O(1)
*/
public class MaximizeSumOfConsecutiveDifferences {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 8 };
		int n = arr.length;
		System.out.println(maxSum(arr, n));
	}

	static int maxSum(int arr[], int n) {
		int sum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++) {
			sum -= (2 * arr[i]);
			sum += (2 * arr[n - i - 1]);
		}
		return sum;
	}

}
