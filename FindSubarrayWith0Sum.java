package Programming;

import java.util.HashMap;

/*Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
Input: {4, 2, -3, 1, 6}
Output: true 
There is a subarray with zero sum from index 1 to 3.

Input: {4, 2, 0, 1, 6}
Output: true 
There is a subarray with zero sum from index 2 to 2.

Input: {-3, 2, 3, 1, 6}
Output: false
There is no subarray with zero sum.
Time Complexity is O(n)*/

public class FindSubarrayWith0Sum {

	public static void main(String[] args) {
		int arr[] = { 4, 2, -3, 1, 6 };
		if (printZeroSumSubarray(arr))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Subarray with 0 sum");

	}

	static Boolean printZeroSumSubarray(int arr[]) {
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)
				return true;
			hM.put(sum, i);
		}
		return false;
	}

}
