package Programming;

/*Maximum Length Bitonic Subarray | Set 1 (O(n) tine and O(n) space)
1) A[] = {12, 4, 78, 90, 45, 23}, the maximum length bitonic subarray is {4, 78, 90, 45, 23} which is of length 5.
2) A[] = {20, 4, 1, 2, 3, 4, 2, 10}, the maximum length bitonic subarray is {1, 2, 3, 4, 2} which is of length 5.
3) A[] = {10}, the single element is bitnoic, so output is 1.
4) A[] = {10, 20, 30, 40}, the complete array itself is bitonic, so output is 4.
5) A[] = {40, 30, 20, 10}, the complete array itself is bitonic, so output is 4.*/

public class MaximumLengthBitonicSubarray_Set1 {

	public static void main(String[] args) {
		int arr[] = { 12, 4, 78, 90, 45, 23 };
		int n = arr.length;
		System.out.println("Length of max length Bitnoic Subarray is " + bitonic(arr, n));

	}

	static int bitonic(int arr[], int n) {
		int[] inc = new int[n]; 
		int[] dec = new int[n];
		int max;
		inc[0] = 1;
		dec[n - 1] = 1;
		for (int i = 1; i < n; i++)
			inc[i] = (arr[i] >= arr[i - 1]) ? inc[i - 1] + 1 : 1;
		for (int i = n - 2; i >= 0; i--)
			dec[i] = (arr[i] >= arr[i + 1]) ? dec[i + 1] + 1 : 1;
		max = inc[0] + dec[0] - 1;
		for (int i = 1; i < n; i++)
			if (inc[i] + dec[i] - 1 > max)
				max = inc[i] + dec[i] - 1;
		return max;
	}
}
