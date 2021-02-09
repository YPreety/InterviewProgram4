package Programming;

public class TwoRepeatingElementsInGivenArray_UsingArrayElementsAsIndex {

	public static void main(String[] args) {
		TwoRepeatingElementsInGivenArray_UsingArrayElementsAsIndex repeat = new TwoRepeatingElementsInGivenArray_UsingArrayElementsAsIndex();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);

	}

	void printRepeating(int arr[], int size) {
		int i;
		System.out.println("The repeating elements are : ");

		for (i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] > 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				System.out.print(Math.abs(arr[i]) + " ");
		}
	}

}
