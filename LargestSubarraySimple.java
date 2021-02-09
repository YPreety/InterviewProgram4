package Programming;

/*Largest subarray with equal number of 0s and 1s
Input: arr[] = {1, 0, 1, 1, 1, 0, 0}
Output: 1 to 6 (Starting and Ending indexes of output subarray)

Input: arr[] = {1, 1, 1, 1}
Output: No such subarray

Input: arr[] = {0, 0, 1, 1, 0}
Output: 0 to 3 Or 1 to 4

Time Complexity: O(n^2)
Auxiliary Space: O(1)*/

public class LargestSubarraySimple {

	public static void main(String[] args) {
		LargestSubarraySimple sub;
		sub = new LargestSubarraySimple();
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		int size = arr.length;

		sub.findSubArray(arr, size);

	}

	int findSubArray(int arr[], int n) {
		int sum = 0;
		int maxsize = -1, startindex = 0;
		int endindex = 0;


		for (int i = 0; i < n - 1; i++) {
			sum = (arr[i] == 0) ? -1 : 1;


			for (int j = i + 1; j < n; j++) {
				if (arr[j] == 0)
					sum += -1;
				else
					sum += 1;

				if (sum == 0 && maxsize < j - i + 1) {
					maxsize = j - i + 1;
					startindex = i;
				}
			}
		}
		endindex = startindex + maxsize - 1;
		if (maxsize == -1)
			System.out.println("No such subarray");
		else
			System.out.println(startindex + " to " + endindex);

		return maxsize;
	}

}
