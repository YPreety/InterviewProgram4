package Programming;

import java.util.Arrays;

/*Closest numbers from a list of unsorted integers
Input : arr[] = {10, 50, 12, 100}
Output : (10, 12)
The closest elements are 10 and 12

Input : arr[] = {5, 4, 3, 2}
Output : (2, 3), (3, 4), (4, 5)*/

public class Closestnumbersfromlist {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 2, 4, 1 };
		int n = arr.length;
		printMinDiffPairs(arr, n);
	}

	static void printMinDiffPairs(int arr[], int n) {
		if (n <= 1)
			return;
		Arrays.sort(arr);
		int minDiff = arr[1] - arr[0];
		for (int i = 2; i < n; i++)
			minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
		for (int i = 1; i < n; i++) {
			if ((arr[i] - arr[i - 1]) == minDiff) {
				System.out.print("(" + arr[i - 1] + ", " + arr[i] + "),");
			}
		}
	}
}
