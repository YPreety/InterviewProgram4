package Design_Patterns;

import java.util.HashMap;

/*Maximum number of chocolates to be distributed equally among k students
Input : arr[] = {2, 7, 6, 1, 4, 5}, k = 3
Output : 6
The subarray is {7, 6, 1, 4} with sum 18.
Equal distribution of 18 chocolates among
3 students is 6.
Note that the selected boxes are in consecutive order
with indexes {1, 2, 3, 4}.
Time Complexity: O(n).
Auxiliary Space: O(n).*/

public class ChocolatesDistributed {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 6, 1, 4, 5 };
		int n = arr.length;
		int k = 3;
		System.out.println("Maximum number of chocolates: " + maxNumOfChocolates(arr, n, k));

	}

	static int maxNumOfChocolates(int arr[], int n, int k) {
		HashMap<Integer, Integer> um = new HashMap<Integer, Integer>();
		int[] sum = new int[n];
		int curr_rem;
		int maxSum = 0;
		sum[0] = arr[0];
		for (int i = 1; i < n; i++)
			sum[i] = sum[i - 1] + arr[i];
		for (int i = 0; i < n; i++) {
			curr_rem = sum[i] % k;
			if (curr_rem == 0) {
				if (maxSum < sum[i])
					maxSum = sum[i];
			}
			else if (!um.containsKey(curr_rem))
				um.put(curr_rem, i);

			else
			if (maxSum < (sum[i] - sum[um.get(curr_rem)]))
				maxSum = sum[i] - sum[um.get(curr_rem)];
		}
		return (maxSum / k);
	}

}
