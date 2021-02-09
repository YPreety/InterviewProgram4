package Programming;

//Find position of an element in a sorted array of infinite numbers
//time complexity is 2*O(Log p)

public class Findpositionofanelement {

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
		int ans = findPos(arr, 10);

		if (ans == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index " + ans);

	}

	static int findPos(int arr[], int key) {
		int l = 0, h = 1;
		int val = arr[0];

		while (val < key) {
			l = h; 
			h = 2 * h; 
			val = arr[h]; 
		}

		return binarySearch(arr, l, h, key);
	}

	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

}
