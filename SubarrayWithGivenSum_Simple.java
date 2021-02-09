package Programming;

/*Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
Ouptut: Sum found between indexes 1 and 4

Input: arr[] = {1, 4}, sum = 0
Output: No subarray found
Time Complexity: O(n^2) in worst case.*/

public class SubarrayWithGivenSum_Simple {

	public static void main(String[] args) {
		SubarrayWithGivenSum_Simple arraysum = new SubarrayWithGivenSum_Simple();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		arraysum.subArraySum(arr, n, sum);
	}

	int subArraySum(int arr[], int n, int sum) {
		int curr_sum, i, j;
		for (i = 0; i < n; i++) {
			curr_sum = arr[i];
			for (j = i + 1; j <= n; j++) {
				if (curr_sum == sum) {
					int p = j - 1;
					System.out.println("Sum found between indexes " + i + " and " + p);
					return 1;
				}
				if (curr_sum > sum || j == n)
					break;
				curr_sum = curr_sum + arr[j];
			}
		}
		System.out.println("No subarray found");
		return 0;
	}
}
