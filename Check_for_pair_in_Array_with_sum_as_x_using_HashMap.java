package Programming;

public class Check_for_pair_in_Array_with_sum_as_x_using_HashMap {

	private static final int MAX = 100000;

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
		printpairs(A, n);
	}

	static void printpairs(int arr[], int sum) {
		boolean[] binmap = new boolean[MAX];
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			if (temp >= 0 && binmap[temp]) {
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
			}
			binmap[arr[i]] = true;
		}
	}
}
