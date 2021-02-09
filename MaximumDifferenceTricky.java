package Programming;

/*Time Complexity: O(n)
Auxiliary Space: O(n)*/

public class MaximumDifferenceTricky {

	public static void main(String[] args) {
		MaximumDifferenceTricky mxdif = new MaximumDifferenceTricky();
		int arr[] = { 80, 2, 6, 3, 100 };
		int size = arr.length;
		System.out.println(mxdif.maxDiff(arr, size));

	}

	int maxDiff(int arr[], int n) {

		int diff[] = new int[n - 1];
		for (int i = 0; i < n - 1; i++)
			diff[i] = arr[i + 1] - arr[i];

		int max_diff = diff[0];
		for (int i = 1; i < n - 1; i++) {
			if (diff[i - 1] > 0)
				diff[i] += diff[i - 1];
			if (max_diff < diff[i])
				max_diff = diff[i];
		}
		return max_diff;
	}

}
