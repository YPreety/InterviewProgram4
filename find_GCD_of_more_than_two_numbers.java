package Programming;

/*GCD of more than two (or array) numbers
Input  : arr[] = {1, 2, 3}
Output : 1

Input  : arr[] = {2, 4, 6, 8}
Output : 2*/
public class find_GCD_of_more_than_two_numbers {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 16 };
		int n = arr.length;
		System.out.println(findGCD(arr, n));
	}

	static int findGCD(int arr[], int n) {
		int result = arr[0];
		for (int i = 1; i < n; i++)
			result = gcd(arr[i], result);
		return result;
	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
