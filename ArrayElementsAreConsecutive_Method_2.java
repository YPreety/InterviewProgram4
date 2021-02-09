package Programming;

/*Mark visited array elements as negative
Time Complexity: O(n)
Extra Space: O(1)*/

public class ArrayElementsAreConsecutive_Method_2 {

	public static void main(String[] args) {
		ArrayElementsAreConsecutive_Method_2 consecutive = new ArrayElementsAreConsecutive_Method_2();
		int arr[] = { 2, 1, 0, -3, -1, -2 };
		int n = arr.length;
		if (consecutive.areConsecutive(arr, n) == true)
			System.out.println("Array elements are consecutive");
		else
			System.out.println("Array elements are not consecutive");

	}

	boolean areConsecutive(int arr[], int n) {
		if (n < 1)
			return false;

		/* 1) Get the minimum element in array */
		int min = getMin(arr, n);

		/* 2) Get the maximum element in array */
		int max = getMax(arr, n);

		/* 3) max-min+1 is equal to n then only check all elements */
		if (max - min + 1 == n) {
			int i;
			for (i = 0; i < n; i++) {
				int j;

				if (arr[i] < 0)
					j = -arr[i] - min;
				else
					j = arr[i] - min;

				// if the value at index j is negative then
				// there is repitition
				if (arr[j] > 0)
					arr[j] = -arr[j];
				else
					return false;
			}

			/*
			 * If we do not see a negative value then all elements are distinct
			 */
			return true;
		}

		return false; // if (max-min+1 != n)
	}

	/* UTILITY FUNCTIONS */
	int getMin(int arr[], int n) {
		int min = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	int getMax(int arr[], int n) {
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}

}
