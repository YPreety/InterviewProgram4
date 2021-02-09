package Programming;

/*Find the index of first 1 in an infinite sorted array of 0s and 1s
Given an infinite sorted array consisting 0s and 1s. The problem is to find the index of first ‘1’ in that array. 
As the array is infinite, therefore it is guaranteed that number ‘1’ will be present in the array.

Input : arr[] = {0, 0, 1, 1, 1, 1} 
Output : 2

Input : arr[] = {1, 1, 1, 1,, 1, 1}
Output : 0

time complexity is 2*O(Log p)*/

public class FindTheIndex {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 1, 1 };
		System.out.println("Index = " + posOfFirstOne(arr));
	}

	public static int posOfFirstOne(int arr[]) {
		int l = 0, h = 1;

		while (arr[h] == 0) {

			l = h;

			h = 2 * h;
		}

		return indexOfFirstOne(arr, l, h);
	}

	public static int indexOfFirstOne(int arr[], int low, int high) {
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;

			if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0))
				break;

			else if (arr[mid] == 1)
				high = mid - 1;

			else
				low = mid + 1;
		}

		return mid;
	}

}
