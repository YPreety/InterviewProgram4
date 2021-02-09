package Programming;

/*Input: {0, 1, 2, 6, 9}, n = 5, m = 10
Output: 3

Input: {4, 5, 10, 11}, n = 4, m = 12
Output: 0

Input: {0, 1, 2, 3}, n = 4, m = 5
Output: 4

Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
Output: 8

Use Binary Search  Time Complexity: O(m log n)
Linear Search  Time Complexity: O(n)
Modified Binary Search  Time Complexity: O(Logn)*/

public class SmallestMissingNumber {

	public static void main(String[] args) {
		SmallestMissingNumber small = new SmallestMissingNumber();
		int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 10 };
		int n = arr.length;
		System.out.println("First Missing element is : " + small.findFirstMissing(arr, 0, n - 1));
	}

	int findFirstMissing(int array[], int start, int end) {
		if (start > end)
			return end + 1;
		if (start != array[start])
			return start;
		int mid = (start + end) / 2;
		if (array[mid] == mid)
			return findFirstMissing(array, mid + 1, end);
		return findFirstMissing(array, start, mid);
	}
}