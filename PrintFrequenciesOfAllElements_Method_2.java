package Programming;

//Method 2 (By adding n to keep track of counts)

public class PrintFrequenciesOfAllElements_Method_2 {

	public static void main(String[] args) {
		PrintFrequenciesOfAllElements_Method_2 count = new PrintFrequenciesOfAllElements_Method_2();
		int arr[] = { 2, 3, 3, 2, 5 };
		int n = arr.length;
		count.printfrequency(arr, n);

	}

	void printfrequency(int arr[], int n) {
		for (int j = 0; j < n; j++)
			arr[j] = arr[j] - 1;
		for (int i = 0; i < n; i++)
			arr[arr[i] % n] = arr[arr[i] % n] + n;
		for (int i = 0; i < n; i++)
			System.out.println(i + 1 + "->" + arr[i] / n);
	}

}
