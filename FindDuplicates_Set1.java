package Programming;

/*Find duplicates in O(n) time and O(1) extra space | Set 1
let n be 7 and array be {1, 2, 3, 1, 3, 6, 6}, the answer should be 1, 3 and 6.
Time Complexity: O(n)
Auxiliary Space: O(1)
*/
public class FindDuplicates_Set1 {

	public static void main(String[] args) {
		FindDuplicates_Set1 duplicate = new FindDuplicates_Set1();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;

		duplicate.printRepeating(arr, arr_size);

	}

	void printRepeating(int arr[], int size) {
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}

}
