package Programming;

/*Input: arr[] = {1, 2, 3, 3, 3, 3, 10}, x = 3
Output: True (x appears more than n/2 times in the given array)

Input: arr[] = {1, 1, 2, 4, 4, 4, 6, 6}, x = 4
Output: False (x doesn't appear more than n/2 times in the given array)

Input: arr[] = {1, 1, 1, 2, 2}, x = 1
Output: True (x appears more than n/2 times in the given array)*/

public class Check_for_Majority_Element_in_a_sorted_array_Using_Linear_Search {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 4, 4, 4 };
		int n = arr.length;
		int x = 4;
		if (isMajority(arr, n, x) == true)
			System.out.println(x + " appears more than " + n / 2 + " times in arr[]");
		else
			System.out.println(x + " does not appear more than " + n / 2 + " times in arr[]");
	}

	static boolean isMajority(int arr[], int n, int x) {
		int i, last_index = 0;
		last_index = (n % 2 == 0) ? n / 2 : n / 2 + 1;
		for (i = 0; i < last_index; i++) {
			if (arr[i] == x && arr[i + n / 2] == x)
				return true;
		}
		return false;
	}
}
