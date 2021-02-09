package Programming;

/*Input : arr[] = {60.25, 62.38, 65.32, 61.41, 63.23}
Output : 0.0307144

Input : arr[] = {15, 36, 53.67, 25.45, 67.8, 56, 78.09}
Output : 0.48177*/

public class CoefficientOfVariation {

	public static void main(String[] args) {
		double arr[] = { 15, 36, 53.67, 25.45, 67.8, 56, 78.09 };
		int n = arr.length;
		System.out.println(coefficientOfVariation(arr, n));
	}

	static double coefficientOfVariation(double arr[], int n) {
		return (standardDeviation(arr, n) / mean(arr, n));
	}

	static double standardDeviation(double arr[], int n) {
		double sum = 0;
		for (int i = 0; i < n; i++)
			sum = sum + (arr[i] - mean(arr, n)) * (arr[i] - mean(arr, n));
		return Math.sqrt(sum / (n - 1));
	}

	static double mean(double arr[], int n) {
		double sum = 0;
		for (int i = 0; i < n; i++)
			sum = sum + arr[i];
		return sum / n;
	}
}
