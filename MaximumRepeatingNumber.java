package Programming;

//Find the maximum repeating number in O(n) time and O(1) extra space

public class MaximumRepeatingNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 3, 5, 3, 4, 1, 7 };
		int n = arr.length;
		int k = 8;
		System.out.println("Maximum repeating element is: " + maxRepeating(arr, n, k));
	}

	static int maxRepeating(int arr[], int n, int k) {
		for (int i = 0; i < n; i++)
			arr[(arr[i] % k)] += k;
		int max = arr[0], result = 0;
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
				result = i;
			}
		}
		return result;
	}
}
