package Programming;

/*Find whether an array is subset of another array 
Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a subset of arr1[] or not. 
Both the arrays are not in sorted order.

Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {1, 2, 3, 4, 5, 6}, arr2[] = {1, 2, 4}
Output: arr2[] is a subset of arr1[]

Input: arr1[] = {10, 5, 2, 23, 19}, arr2[] = {19, 5, 3}
Output: arr2[] is not a subset of arr1[]
		
Time Complexity: O(m*n)*/
public class ArrayIsSubsetOfAnotherArray_Simple {

	public static void main(String[] args) {
		int arr1[] = { 11, 1, 13, 21, 3, 7 };
		int arr2[] = { 11, 3, 7, 1 };
		int m = arr1.length;
		int n = arr2.length;
		if (isSubset(arr1, arr2, m, n))
			System.out.print("arr2[] is subset of arr1[] ");
		else
			System.out.print("arr2[] is not a subset of arr1[]");
	}

	static boolean isSubset(int arr1[], int arr2[], int m, int n) {
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				if (arr2[i] == arr1[j])
					break;
			}
			if (j == m)
				return false;
		}
		return true;
	}
}
