package Programming;

public class PrintFrequenciesOfAllElements_Method_1 {

	public static void main(String[] args) {
		PrintFrequenciesOfAllElements_Method_1 count = new PrintFrequenciesOfAllElements_Method_1();
		int arr[] = { 2, 3, 3, 2, 5 };
		count.findCounts(arr, arr.length);

		int arr1[] = { 1 };
		count.findCounts(arr1, arr1.length);

		int arr3[] = { 4, 4, 4, 4 };
		count.findCounts(arr3, arr3.length);

		int arr2[] = { 1, 3, 5, 7, 9, 1, 3, 5, 7, 9, 1 };
		count.findCounts(arr2, arr2.length);
	}

	void findCounts(int arr[], int n) {
		int i = 0;
		while (i < n) {
			if (arr[i] <= 0) {
				i++;
				continue;
			}
			int elementIndex = arr[i] - 1;
			if (arr[elementIndex] > 0) {
				arr[i] = arr[elementIndex];
				arr[elementIndex] = -1;
			} else {
				arr[elementIndex]--;
				arr[i] = 0;
				i++;
			}
		}

		System.out.println("Below are counts of all elements");
		for (int j = 0; j < n; j++)
			System.out.println(j + 1 + "->" + Math.abs(arr[j]));
	}

}
