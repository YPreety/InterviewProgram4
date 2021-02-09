package Programming;

/*Find last k digits in product of an array numbers
Input  : a[] = {22, 31, 44, 27, 37, 43}
Output : 56

Input  : a[] = {24, 7, 144, 77, 29, 19}
Output : 84*/

public class LastkDigitsInProduct {

	public static void main(String[] args) {
		int a[] = { 22, 31, 44, 27, 37, 43 };
		int k = 2;
		int n = a.length;

		System.out.println(lastKDigits(a, n, k));

	}

	static int lastKDigits(int a[], int n, int k) {
		int num = (int) (Math.pow(10, k));

		int mul = a[0] % num;

		for (int i = 1; i < n; i++) {
			a[i] = a[i] % num;
			mul = (a[i] * mul) % num;
		}
		return mul;
	}

}
