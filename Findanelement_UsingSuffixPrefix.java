package Programming;

/*Find an element in array such that sum of left array is equal to sum of right array
Input : 1 4 2 5
Output : 2
Explanation : If 2 is the partition, 
      subarrays are : {1, 4} and {5}

Input : 2 3 4 1 4 5
Output : 1
Explanation : If 1 is the partition, 
 Subarrays are : {2, 3, 4} and {4, 5}*/

public class Findanelement_UsingSuffixPrefix {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 5 };
		int n = arr.length;
		System.out.println(findElement(arr, n));
	}

	static int findElement(int arr[], int n) {
		int[] prefixSum = new int[n];
		prefixSum[0] = arr[0];
		for (int i = 1; i < n; i++)
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		int[] suffixSum = new int[n];
		suffixSum[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			suffixSum[i] = suffixSum[i + 1] + arr[i];
		for (int i = 1; i < n - 1; i++)
			if (prefixSum[i] == suffixSum[i])
				return arr[i];
		return -1;
	}
}
