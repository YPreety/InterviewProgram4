package Design_Patterns;

/*Input : arr[] = {10, 3, 5, 6, 2}
Output : prod[] = {180, 600, 360, 300, 900}
Use property of log to multiply large numbers
x = a * b * c * d
log(x) = log(a * b * c * d)
log(x) = log(a) + log(b) + log(c) + log(d)
x = antilog(log(a) + log(b) + log(c) + log(d))

Time complexity : O(n)
Space complexity: O(1)*/

public class ProductArrayPuzzleTricky {

	static final double EPS = 1e-9;

	public static void main(String[] args) {
		int a[] = { 10, 3, 5, 6, 2 };
		int n = a.length;
		System.out.println("The product array is: ");
		productPuzzle(a, n);

	}

	static void productPuzzle(int a[], int n) {
		// to hold sum of all values
		double sum = 0;
		for (int i = 0; i < n; i++)
			sum += Math.log10(a[i]);

		// output product for each index
		// anti log to find original product value
		for (int i = 0; i < n; i++)
			System.out.print((int) (EPS + Math.pow(10.00, sum - Math.log10(a[i]))) + " ");
	}

}
