package Programming;

import java.util.HashSet;

/*Length of the largest subarray with contiguous elements
Time complexity is O(n2)
Input:  arr[] = {10, 12, 11};
Output: Length of the longest contiguous subarray is 3

Input:  arr[] = {10, 12, 12, 10, 10, 11, 10};
Output: Length of the longest contiguous subarray is 2 */

public class LengthOfLargestSubarray {

	public static void main(String[] args) {
		int arr[] = { 10, 12, 12, 10, 10, 11, 10 };
		System.out.println("Length of the longest contiguous subarray is " + findLength(arr));

	}

	static int findLength(int arr[]) {
		int n = arr.length;
		int max_len = 1; 
		for (int i = 0; i < n - 1; i++) {
			HashSet<Integer> set = new HashSet<>();
			set.add(arr[i]);
			int mn = arr[i], mx = arr[i];
			for (int j = i + 1; j < n; j++) {
				if (set.contains(arr[j]))
					break;
				set.add(arr[j]);
				mn = Math.min(mn, arr[j]);
				mx = Math.max(mx, arr[j]);
				if (mx - mn == j - i)
					max_len = Math.max(max_len, mx - mn + 1);
			}
		}
		return max_len; 
	}

}
