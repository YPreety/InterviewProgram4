package Programming;

/*Write a function to count number of smaller elements on right of each element in an array.
Given an unsorted array arr[] of distinct integers, construct another array countSmaller[] such that countSmaller[i] 
contains count of smaller elements on right side of each element arr[i] in array.

Input:   arr[] =  {12, 1, 2, 3, 0, 11, 4}
Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0} 

(Corner Cases)
Input:   arr[] =  {5, 4, 3, 2, 1}
Output:  countSmaller[]  =  {4, 3, 2, 1, 0} 

Input:   arr[] =  {1, 2, 3, 4, 5}
Output:  countSmaller[]  =  {0, 0, 0, 0, 0}

Time Complexity: O(n^2)
Auxiliary Space: O(1)*/

public class Countsmallerelementsonrightside {

	public static void main(String[] args) {
		Countsmallerelementsonrightside small = new Countsmallerelementsonrightside();
		int arr[] = { 12, 10, 5, 4, 2, 20, 6, 1, 0, 2 };
		int n = arr.length;
		int low[] = new int[n];
		small.constructLowerArray(arr, low, n);
		small.printArray(low, n);

	}

	void constructLowerArray(int arr[], int countSmaller[], int n) {
		int i, j;
		for (i = 0; i < n; i++)
			countSmaller[i] = 0;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[j] < arr[i])
					countSmaller[i]++;
			}
		}
	}

	void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}
}
