package Programming;

/*Input : arr[] = {5, 5, 10, 100, 10, 5}
Output : 110

Input : arr[] = {1, 2, 3}
Output : 4

Input : arr[] = {1, 20, 3}
Output : 20*/

public class Maximum_sum_such_that_no_two_elements_are_adjacent {

	public static void main(String[] args) {
		Maximum_sum_such_that_no_two_elements_are_adjacent sum = new Maximum_sum_such_that_no_two_elements_are_adjacent();
		int arr[] = new int[] { 5, 5, 10, 100, 10, 5 };
		System.out.println(sum.FindMaxSum(arr, arr.length));

	}

	int FindMaxSum(int arr[], int n) {
		int incl = arr[0];
		int excl = 0;
		int excl_new;
		int i;

		for (i = 1; i < n; i++) {

			excl_new = (incl > excl) ? incl : excl;

			incl = excl + arr[i];
			excl = excl_new;
		}

		return ((incl > excl) ? incl : excl);
	}

}
