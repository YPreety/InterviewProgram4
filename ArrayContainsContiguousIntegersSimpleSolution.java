package Programming;

import java.util.Arrays;

/*Check if array contains contiguous integers with duplicates allowed simple solution
Input : arr[] = {5, 2, 3, 6, 4, 4, 6, 6}
Output : Yes
The elements form a contiguous set of integers
which is {2, 3, 4, 5, 6}.

Input : arr[] = {10, 14, 10, 12, 12, 13, 15}
Output : No*/

public class ArrayContainsContiguousIntegersSimpleSolution {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 6, 4, 4, 6, 6 };
		int n = arr.length;
		if (areElementsContiguous(arr, n))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static boolean areElementsContiguous(int arr[], int n) {
		Arrays.sort(arr);
		for (int i = 1; i < n; i++)
			if (arr[i] - arr[i - 1] > 1)
				return false;
		return true;
	}
}
