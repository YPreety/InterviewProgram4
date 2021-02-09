package Programming;

/*Input : arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2}
Output : 5
The subarray is {3, 5, 7, 8, 9}

Input : arr[] = {12, 13, 1, 5, 4, 7, 8, 10, 10, 11}
Output : 4
The subarray is {4, 7, 8, 10}*/

public class Longestincreasingsubarray {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 3, 5, 7, 8, 9, 1, 2 };
		int n = arr.length;
		System.out.println("Length of longest increasing subarray = " + lenOfLongIncSubArr(arr, n));
		System.out.print("print Longest increasing subarray = ");
		printLogestIncSubArr(arr, n);

	}

	public static int lenOfLongIncSubArr(int arr[], int n) {
		int max = 1, len = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				len++;
			else {
				if (max < len)
					max = len;
				len = 1;
			}
		}
		if (max < len)
			max = len;
		return max;
	}

	public static void printLogestIncSubArr(int arr[], int n) {
		int max = 1, len = 1, maxIndex = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i - 1])
				len++;
			else {
				if (max < len) {
					max = len;
					maxIndex = i - max;
				}
				len = 1;
			}
		}
		if (max < len) {
			max = len;
			maxIndex = n - max;
		}
		for (int i = maxIndex; i < max + maxIndex; i++)
			System.out.print(arr[i] + " ");
	}

}
