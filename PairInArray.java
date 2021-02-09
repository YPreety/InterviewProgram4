package Programming;

/*Given a sorted array and a number x, find the pair in array whose sum is closest to x
Input: arr[] = {10, 22, 28, 29, 30, 40}, x = 54
Output: 22 and 30

Input: arr[] = {1, 3, 4, 7, 10}, x = 15
Output: 4 and 10

Time complexity is O(n2)*/

public class PairInArray {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 28, 29, 30, 40 }, x = 54;
		int n = arr.length;
		printClosest(arr, n, x);

	}

	static void printClosest(int arr[], int n, int x) {
		int res_l = 0, res_r = 0; 
		int l = 0, r = n - 1, diff = Integer.MAX_VALUE;
		while (r > l) {
			if (Math.abs(arr[l] + arr[r] - x) < diff) {
				res_l = l;
				res_r = r;
				diff = Math.abs(arr[l] + arr[r] - x);
			}
			if (arr[l] + arr[r] > x)
				r--;
			else 
				l++;
		}
		System.out.println(" The closest pair is " + arr[res_l] + " and " + arr[res_r]);
	}
}
