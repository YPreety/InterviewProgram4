package Design_Patterns;

/*Time Complexity: O(n)
Space Complexity: O(n)
Auxiliary Space: O(1)*/

public class ProductArrayPuzzleEfficient {

	public static void main(String[] args) {
		ProductArrayPuzzleEfficient pa = new ProductArrayPuzzleEfficient();
		int arr[] = { 10, 3, 5, 6, 2 };
		int n = arr.length;
		System.out.println("The product array is : ");
		pa.productArray(arr, n);

	}

	void productArray(int arr[], int n) {
		int i, temp = 1;
		int prod[] = new int[n];
		for (int j = 0; j < n; j++)
			prod[j] = 1;
		for (i = 0; i < n; i++) {
			prod[i] = temp;
			temp *= arr[i];
		}
		temp = 1;
		for (i = n - 1; i >= 0; i--) {
			prod[i] *= temp;
			temp *= arr[i];
		}
		for (i = 0; i < n; i++)
			System.out.print(prod[i] + " ");

		return;
	}

}
