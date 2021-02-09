package Programming;

/*Time Complexity: O(n)
Auxiliary Space: O(1)*/

public class MaximumDifferenceEfficient {

	public static void main(String[] args) {
		MaximumDifferenceEfficient maxdif = new MaximumDifferenceEfficient();
		int arr[] = { 1, 2, 90, 10, 110 };
		int size = arr.length;
		System.out.println("MaximumDifference is " + maxdif.maxDiff(arr, size));

	}

	int maxDiff(int arr[], int arr_size) {
		int max_diff = arr[1] - arr[0];
		int min_element = arr[0];
		int i;
		for (i = 1; i < arr_size; i++) {
			if (arr[i] - min_element > max_diff)
				max_diff = arr[i] - min_element;
			if (arr[i] < min_element)
				min_element = arr[i];
		}
		return max_diff;
	}

}
