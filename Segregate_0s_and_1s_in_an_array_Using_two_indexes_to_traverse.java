package Programming;

public class Segregate_0s_and_1s_in_an_array_Using_two_indexes_to_traverse {

	public static void main(String[] args) {
		Segregate_0s_and_1s_in_an_array_Using_two_indexes_to_traverse seg = new Segregate_0s_and_1s_in_an_array_Using_two_indexes_to_traverse();
		int arr[] = new int[] { 0, 1, 0, 1, 1, 1 };
		int i, arr_size = arr.length;
		seg.segregate0and1(arr, arr_size);
		System.out.print("Array after segregation is ");
		for (i = 0; i < 6; i++)
			System.out.print(arr[i] + " ");
	}

	void segregate0and1(int arr[], int size) {
		int left = 0, right = size - 1;
		while (left < right) {
			while (arr[left] == 0 && left < right)
				left++;
			while (arr[right] == 1 && left < right)
				right--;
			if (left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
	}
}
