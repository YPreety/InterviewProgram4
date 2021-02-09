package Programming;

/*Smallest subarray with product divisible by k
Input : arr[] = {1, 9, 16, 5, 4, 3, 2}   
k = 720
Output: 3
The smallest subarray is {9, 16, 5} whose
product is 720.

Input : arr[] = {1, 2, 4, 5, 6}
K = 96
Output : No such subarray exists

Time Complexity = O(n^2)*/

public class SmallestSubarrayWithProduct {

	public static void main(String[] args) {
		int array[] = { 1, 9, 16, 5, 4, 3, 2 };
		int k = 720;
		int answer = findsubArray(array, k);
		if (answer != 0)
			System.out.println(answer);
		else
			System.out.println("No Such subarray exists.");
	}

	public static int findsubArray(int arr[], int k) {
		int n = arr.length;
		int res = n + 1;
		for (int i = 0; i < n; i++) {
			int curr_prod = 1;
			for (int j = i; j < n; j++) {
				curr_prod = curr_prod * arr[j];
				if (curr_prod % k == 0 && res > (j - i + 1)) {
					res = Math.min(res, j - i + 1);
					break;
				}
			}
		}
		return (res == n + 1) ? 0 : res;
	}
}
