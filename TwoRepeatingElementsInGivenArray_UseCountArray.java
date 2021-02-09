package Programming;

public class TwoRepeatingElementsInGivenArray_UseCountArray {

	public static void main(String[] args) {
		TwoRepeatingElementsInGivenArray_UseCountArray repeat = new TwoRepeatingElementsInGivenArray_UseCountArray();
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		int arr_size = arr.length;
		repeat.printRepeating(arr, arr_size);

	}

	void printRepeating(int arr[], int size) {
		int count[] = new int[size];
		int i;

		System.out.println("Repeated elements are : ");
		for (i = 0; i < size; i++) {
			if (count[arr[i]] == 1)
				System.out.print(arr[i] + " ");
			else
				count[arr[i]]++;
		}
	}

}
