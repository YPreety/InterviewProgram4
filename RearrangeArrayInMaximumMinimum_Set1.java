package Programming;

import java.util.Arrays;

/*Given a sorted array of positive integers, rearrange the array alternately i.e first element should be maximum value, 
second minimum value, third second max, fourth second min and so on.
Input  : arr[] = {1, 2, 3, 4, 5, 6, 7} 
Output : arr[] = {7, 1, 6, 2, 5, 3, 4}

Input  : arr[] = {1, 2, 3, 4, 5, 6} 
Output : arr[] = {6, 1, 5, 2, 4, 3}

Time Complexity : O(n)
Auxiliary Space : O(n)*/

public class RearrangeArrayInMaximumMinimum_Set1 {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Original Array ");
		System.out.println(Arrays.toString(arr));
		rearrange(arr, arr.length);
	}

	static void rearrange(int[] arr, int n) {
		int temp[] = new int[n];
		int small = 0, large = n - 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag)
				temp[i] = arr[large--];
			else
				temp[i] = arr[small++];
			flag = !flag;
		}
		System.out.println("Modified Array ");
		System.out.println(Arrays.toString(temp));
	}
}
