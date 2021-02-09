package Programming;

public class Check_for_pair_in_Array_with_sum_as_x_using_QuickSort {

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, -8 };
		int n = 16;
		int arr_size = 6;
		if (hasArrayTwoCandidates(A, arr_size, n))
			System.out.println("Array has two " + "elements with sum 16");
		else
			System.out.println("Array doesn't have " + "two elements with sum 16 ");
	}

	static boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) {
		int l, r;
		sort(A, 0, arr_size - 1);
		l = 0;
		r = arr_size - 1;
		while (l < r) {
			if (A[l] + A[r] == sum)
				return true;
			else if (A[l] + A[r] < sum)
				l++;
			else
				r--;
		}
		return false;
	}

	static void sort(int arr[], int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);
			sort(arr, low, pi - 1);
			sort(arr, pi + 1, high);
		}
	}

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j <= high - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		return i + 1;
	}
}
