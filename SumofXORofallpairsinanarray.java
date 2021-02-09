package Programming;

/*Input : arr[] = {7, 3, 5}
Output : 12
7 ^ 3 = 4
3 ^ 5 = 6
7 ^ 5 = 2
Sum = 4 + 6 + 2 
    = 12

Input : arr[] = {5, 9, 7, 6}
Output : 47
5 ^ 9 = 12
9 ^ 7 = 14
7 ^ 6 = 1
5 ^ 7 = 2
5 ^ 6 = 3
9 ^ 6 = 15
Sum = 12 + 14 + 1 + 2 + 3 + 15
    = 47
time complexity is O(n2).*/

public class SumofXORofallpairsinanarray {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 7, 6 };
		int n = arr.length;
		System.out.println(pairORSum(arr, arr.length));
	}

	static int pairORSum(int arr[], int n) {
		int ans = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				ans += arr[i] ^ arr[j];
		return ans;
	}
}
