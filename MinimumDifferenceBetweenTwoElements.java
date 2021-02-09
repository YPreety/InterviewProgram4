package Programming;

/*Find minimum difference between any two elements
Input  : {1, 5, 3, 19, 18, 25};
Output : 1
Minimum difference is between 18 and 19

Input  : {30, 5, 20, 9};
Output : 4
Minimum difference is between 5 and 9

Input  : {1, 19, -4, 31, 38, 25, 100};
Output : 5
Minimum difference is between 1 and -4
Simple: O(n2)*/

public class MinimumDifferenceBetweenTwoElements {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 5, 3, 19, 18, 25 };
		System.out.println("Minimum difference is " + findMinDiff(arr, arr.length));
	}

	static int findMinDiff(int[] arr, int n) {
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (Math.abs((arr[i] - arr[j])) < diff)
					diff = Math.abs((arr[i] - arr[j]));
		return diff;
	}
}
