package Programming;

//move from right to left 

public class DeleteElementFromArrayUsingOneTraversals {

	public static void main(String[] args) {
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int n = arr.length;
		int x = 6;
		n = deleteElement(arr, n, x);

		System.out.println("Modified array is");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");

	}

	static int deleteElement(int arr[], int n, int x) {
		if (arr[n - 1] == x)
			return (n - 1);

		int prev = arr[n - 1], i;
		for (i = n - 2; i >= 0 && arr[i] != x; i--) {
			int curr = arr[i];
			arr[i] = prev;
			prev = curr;
		}

		if (i < 0)
			return 0;

		arr[i] = prev;

		return (n - 1);
	}

}
