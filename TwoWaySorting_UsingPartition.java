package Programming;

import java.util.Arrays;
import java.util.Collections;

/*Sort all even numbers in ascending order and then sort all odd numbers in descending order
Input  : arr[] = {1, 2, 3, 5, 4, 7, 10}
Output : arr[] = {7, 5, 3, 1, 2, 4, 10}

Input  : arr[] = {0, 4, 5, 3, 7, 2, 1}
Output : arr[] = {7, 5, 3, 1, 0, 2, 4} 

Time complexity: O(n log n)
space complexity: O(1)*/

public class TwoWaySorting_UsingPartition {

	public static void main(String[] args) {
		Integer arr[] = { 1, 3, 2, 7, 5, 4 };
		twoWaySort(arr, arr.length);
		System.out.println(Arrays.toString(arr));

	}

	static void twoWaySort(Integer arr[], int n) {
		int l = 0, r = n - 1;
		int k = 0;
		while (l < r) {
			while (arr[l] % 2 != 0) {
				l++;
				k++;
			}
			while (arr[r] % 2 == 0 && l < r)
				r--;
			if (l < r) {
				int temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
			}
		}
		Arrays.sort(arr, 0, k, Collections.reverseOrder());
		Arrays.sort(arr, k, n);
	}

}
