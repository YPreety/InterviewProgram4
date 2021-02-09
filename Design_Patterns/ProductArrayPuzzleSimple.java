package Design_Patterns;

/*Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal 
to the product of all the elements of arr[] except arr[i]. Solve it without division operator and in O(n).
arr[] = {10, 3, 5, 6, 2}
prod[] = {180, 600, 360, 300, 900}
Time Complexity: O(n)
Space Complexity: O(n)
Auxiliary Space: O(n)*/

public class ProductArrayPuzzleSimple {

	public static void main(String[] args) {
		ProductArrayPuzzleSimple pa = new ProductArrayPuzzleSimple();
		int arr[] = { 10, 3, 5, 6, 2 };
		int n = arr.length;
		System.out.println("The product array is : ");
		pa.productArray(arr, n);

	}

	void productArray(int arr[], int n) {
		// Initialize memory to all arrays
		int left[] = new int[n];
		int right[] = new int[n];
		int prod[] = new int[n];

		int i, j;

		/* Left most element of left array is always 1 */
		left[0] = 1;

		/* Rightmost most element of right array is always 1 */
		right[n - 1] = 1;

		/* Construct the left array */
		for (i = 1; i < n; i++)
			left[i] = arr[i - 1] * left[i - 1];

		/* Construct the right array */
		for (j = n - 2; j >= 0; j--)
			right[j] = arr[j + 1] * right[j + 1];

		/*
		 * Construct the product array using left[] and right[]
		 */
		for (i = 0; i < n; i++)
			prod[i] = left[i] * right[i];

		/* print the constructed prod array */
		for (i = 0; i < n; i++)
			System.out.print(prod[i] + " ");

		return;
	}

}
