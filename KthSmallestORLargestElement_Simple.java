package Programming;

import java.util.Arrays;

/*K’th Smallest/Largest Element in Unsorted Array 
Given an array and a number k where k is smaller than size of array,
we need to find the k’th smallest element in the given array. 
It is given that ll array elements are distinct.
Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 4
Output: 10
Time Complexity is O(nLogn).*/
public class KthSmallestORLargestElement_Simple {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));

	}

	public static int kthSmallest(Integer[] arr, int k) {

		Arrays.sort(arr);

		return arr[k - 1];
	}

}
