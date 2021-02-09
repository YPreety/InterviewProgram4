package Programming;

/*Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
time complexity is O(n) and extra space is O(1).*/
public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		int n = arr.length;
		pushZerosToEnd(arr, n);
		System.out.println("Array after pushing zeros to the back: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	static void pushZerosToEnd(int arr[], int n) {
		int count = 0; 
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i]; 
		while (count < n)
			arr[count++] = 0;
	}
}
