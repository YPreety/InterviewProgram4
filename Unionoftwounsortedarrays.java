package Programming;

import java.util.Arrays;

// Using sorting and searching

public class Unionoftwounsortedarrays {

	public static void main(String[] args) {
		Unionoftwounsortedarrays u_i = new Unionoftwounsortedarrays();
		int arr1[] = { 7, 1, 5, 2, 3, 6 };
		int arr2[] = { 3, 8, 6, 20, 7 };
		int m = arr1.length;
		int n = arr2.length;
		System.out.println("Union of two arrays is ");
		u_i.printUnion(arr1, arr2, m, n);
	}

	void printUnion(int arr1[], int arr2[], int m, int n) {
		if (m > n) {
			int tempp[] = arr1;
			arr1 = arr2;
			arr2 = tempp;
			int temp = m;
			m = n;
			n = temp;
		}
		Arrays.sort(arr1);
		for (int i = 0; i < m; i++)
			System.out.print(arr1[i] + " ");
		for (int i = 0; i < n; i++) {
			if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
				System.out.print(arr2[i] + " ");
		}
	}

	int binarySearch(int arr[], int l, int r, int x) {
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
