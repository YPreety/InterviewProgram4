package Programming;

/*Minimum absolute difference of XOR values of two subarrays
Input : arr[] = {12, 6, 20, 14, 38, 6}
Output : 16
The two subarrays are:
{12, 6, 20} = 12 ^ 6 ^ 20 = 30
{14, 38, 6} = 14 ^ 38 ^ 6 = 46
Absolute difference = abs(30-46) 
                    = 16

Input : arr[] = {10, 16, 9, 34, 7, 46, 23}
Output : 1
Time Complexity: O(n)*/
public class MinimumAbsoluteDifference {

	public static void main(String[] args) {
		int arr[] = { 12, 6, 20, 14, 38, 6 };
		int n = 6;
		System.out.println("Minimum Absolute Difference = " + minDiffBtwXorValues(arr, n));

	}

	public static int minDiffBtwXorValues(int arr[], int n) {
		int tot_xor = 0;
		for (int i = 0; i < n; i++)
			tot_xor ^= arr[i];
		int part_xor = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			tot_xor ^= arr[i];
			part_xor ^= arr[i];
			if (Math.abs(tot_xor - part_xor) < min)
				min = Math.abs(tot_xor - part_xor);
		}
		return min;
	}

}
