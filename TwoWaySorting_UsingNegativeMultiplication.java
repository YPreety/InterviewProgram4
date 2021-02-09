package Programming;

import java.util.Arrays;

/*Time complexity: O(n log n)
space complexity: O(1)*/

public class TwoWaySorting_UsingNegativeMultiplication {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 7, 5, 4 };
		twoWaySort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}

	static void twoWaySort(int arr[], int n) {
		for (int i = 0; i < n; i++)
			if ((arr[i] & 1) != 0) // Check for odd
				arr[i] *= -1;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++)
			if ((arr[i] & 1) != 0)
				arr[i] *= -1;
	}

}
