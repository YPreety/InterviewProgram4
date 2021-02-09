package Programming;

/*Smallest subarray with sum greater than a given value
Examples:
arr[] = {1, 4, 45, 6, 0, 19}
   x  =  51
Output: 3
Minimum length subarray is {4, 45, 6}

arr[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Minimum length subarray is {10}

arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
    x = 280
Output: 4
Minimum length subarray is {100, 1, 0, 200}

arr[] = {1, 2, 4}
    x = 8
Output : Not Possible
Whole array sum is smaller than 8.

Time complexity is O(n2).*/

public class SmallestSubarrayWithSumSimple {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 45, 6, 10, 19 };
		int x = 51;
		int n1 = arr1.length;
		int res1 = smallestSubWithSum(arr1, n1, x);
		if (res1 == n1 + 1)
			System.out.println("Not Possible");
		else
			System.out.println(res1);

	}

	static int smallestSubWithSum(int arr[], int n, int x) {
		int min_len = n + 1;
		for (int start = 0; start < n; start++) {
			int curr_sum = arr[start];
			if (curr_sum > x)
				return 1;
			for (int end = start + 1; end < n; end++) {
				curr_sum += arr[end];
				if (curr_sum > x && (end - start + 1) < min_len)
					min_len = (end - start + 1);
			}
		}
		return min_len;
	}

}
