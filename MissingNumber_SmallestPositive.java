package Programming;

/*Find the smallest positive number missing from an unsorted array
Input:  {2, 3, 7, 6, 8, -1, -10, 15}
Output: 1

Input:  { 2, 3, -7, 6, 8, 1, -10, 15 }
Output: 4

Input: {1, 1, 0, -1, -2}
Output: 2 */

public class MissingNumber_SmallestPositive {

	public static void main(String[] args) {
		int arr[] = { 0, 10, 2, -10, -20 };
		int arr_size = arr.length;
		int missing = findMissing(arr, arr_size);
		System.out.println("The smallest positive missing number is " + missing);
	}

	static int findMissing(int arr[], int size) {
		int shift = segregate(arr, size);
		int arr2[] = new int[size - shift];
		int j = 0;
		for (int i = shift; i < size; i++) {
			arr2[j] = arr[i];
			j++;
		}
		return findMissingPositive(arr2, j);
	}

	static int segregate(int arr[], int size) {
		int j = 0, i;
		for (i = 0; i < size; i++) {
			if (arr[i] <= 0) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return j;
	}

	static int findMissingPositive(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++) {
			if (Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
		}
		for (i = 0; i < size; i++)
			if (arr[i] > 0)
				return i + 1; 
		return size + 1;
	}
}
