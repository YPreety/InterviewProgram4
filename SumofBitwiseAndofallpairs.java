package Programming;

/*Input:  arr[] = {5, 10, 15}
Output: 15
Required Value = (5 & 10) + (5 & 15) + (10 & 15) 
               = 0 + 5 + 10 
               = 15

Input: arr[] = {1, 2, 3, 4}
Output: 3
Required Value = (1 & 2) + (1 & 3) + (1 & 4) + 
                 (2 & 3) + (2 & 4) + (3 & 4) 
               = 0 + 1 + 0 + 2 + 0 + 0
               = 3
time complexity is O(n2). */

public class SumofBitwiseAndofallpairs {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 7, 6 };
		int n = arr.length;
		System.out.println(pairAndSum(arr, arr.length));
	}

	static int pairAndSum(int arr[], int n) {
		int ans = 0; 
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				ans += arr[i] & arr[j];
		return ans;
	}
}
