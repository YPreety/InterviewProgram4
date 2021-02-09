package Programming;

//time complexity is O(n)

public class SubarrayWithGivenSum_Efficient {

	public static void main(String[] args) {
		SubarrayWithGivenSum_Efficient arraysum = new SubarrayWithGivenSum_Efficient();
		int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		arraysum.subArraySum(arr, n, sum);
	}

	int subArraySum(int arr[], int n, int sum) {
		int curr_sum = arr[0], start = 0, i;
		for (i = 1; i <= n; i++) {
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println("Sum found between indexes " + start + " and " + p);
				return 1;
			}
			if (i < n)
				curr_sum = curr_sum + arr[i];
		}
		System.out.println("No subarray found");
		return 0;
	}
}
