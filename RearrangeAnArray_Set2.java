package Programming;

/*Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’
Given an array of size n where all elements are in range from 0 to n-1, 
change contents of arr[] so that arr[i] = j is changed to arr[j] = i.

Example 1:
Input: arr[]  = {1, 3, 0, 2};
Output: arr[] = {2, 0, 3, 1};
Explanation for the above output.
Since arr[0] is 1, arr[1] is changed to 0
Since arr[1] is 3, arr[3] is changed to 1
Since arr[2] is 0, arr[0] is changed to 2
Since arr[3] is 2, arr[2] is changed to 3

Example 2:
Input: arr[]  = {2, 0, 1, 4, 5, 3};
Output: arr[] = {1, 2, 0, 5, 3, 4};

Example 3:
Input: arr[]  = {0, 1, 2, 3};
Output: arr[] = {0, 1, 2, 3};

Example 4:
Input: arr[]  = {3, 2, 1, 0};
Output: arr[] = {3, 2, 1, 0};

Time complexity is O(n) and auxiliary space needed is O(n).*/

public class RearrangeAnArray_Set2 {

	public static void main(String[] args) {
		RearrangeAnArray_Set2 arrange = new RearrangeAnArray_Set2();
		int arr[] = { 1, 3, 0, 2 };
		int n = arr.length;
		System.out.println("Given array is ");
		arrange.printArray(arr, n);
		arrange.rearrangeNaive(arr, n);
		System.out.println("Modified array is ");
		arrange.printArray(arr, n);
	}

	void rearrangeNaive(int arr[], int n) {
		int temp[] = new int[n];
		int i;
		for (i = 0; i < n; i++)
			temp[arr[i]] = i;
		for (i = 0; i < n; i++)
			arr[i] = temp[i];
	}

	void printArray(int arr[], int n) {
		int i;
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
